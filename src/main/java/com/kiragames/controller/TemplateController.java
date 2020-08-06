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

import com.kiragames.model.Template;
import com.kiragames.service.TemplateService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/template")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TemplateController {
	
	@Autowired
	private TemplateService ts;
	
	@PostMapping
	public ResponseEntity<Template> save(@RequestBody Template tmp) {
		ts.save(tmp);
		return ResponseEntity.ok(tmp);
	}

	@GetMapping
	public List<Template> findAll() {
		return ts.findAll();
	}

}
