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

import com.kiragames.model.PersonaTemplate;
import com.kiragames.service.PersonaTemplateService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/persona/template","/template/persona"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaTemplateController {
	
	@Autowired
	private PersonaTemplateService mts;
	
	@PostMapping
	public ResponseEntity<PersonaTemplate> save(@RequestBody PersonaTemplate meta) {
		mts.save(meta);
		return ResponseEntity.ok(meta);
	}

	@GetMapping
	public List<PersonaTemplate> findAll() {
		return mts.findAll();
	}

}
