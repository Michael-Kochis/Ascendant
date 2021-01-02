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

import com.kiragames.model.TemplateContains;
import com.kiragames.service.TemplateContainsService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/template/contains")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TemplateContainsController {
	
	@Autowired
	private TemplateContainsService tcs;
	
	@PostMapping
	public ResponseEntity<TemplateContains> save(@RequestBody TemplateContains tc) {
		tcs.save(tc);
		return ResponseEntity.ok(tc);
	}

	@GetMapping
	public List<TemplateContains> findAll() {
		return tcs.findAll();
	}

}
