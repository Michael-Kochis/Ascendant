package com.kiragames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiragames.model.MetaTemplate;
import com.kiragames.service.MetaTemplateService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/meta/template","/template/meta"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class MetaTemplateController {
	
	@Autowired
	private MetaTemplateService mts;
	
	@PostMapping
	public ResponseEntity<MetaTemplate> save(@RequestBody MetaTemplate meta) {
		mts.save(meta);
		return ResponseEntity.ok(meta);
	}

	@GetMapping
	public List<MetaTemplate> findAll() {
		return mts.findAll();
	}

}
