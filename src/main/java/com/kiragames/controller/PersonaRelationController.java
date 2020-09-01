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

import com.kiragames.model.PersonaRelation;
import com.kiragames.service.PersonaRelationService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/persona/relation", "/relation/persona"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaRelationController {
	
	@Autowired
	private PersonaRelationService mrs;
	
	@PostMapping
	public ResponseEntity<PersonaRelation> save(@RequestBody PersonaRelation mr) {
		mrs.save(mr);
		return ResponseEntity.ok(mr);
	}

	@GetMapping
	public List<PersonaRelation> findAll() {
		return mrs.findAll();
	}

}
