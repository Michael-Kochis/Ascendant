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

import com.kiragames.model.PersonaTrait;
import com.kiragames.service.PersonaTraitService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/persona/trait", "/trait/persona"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaTraitController {
	
	@Autowired
	private PersonaTraitService ptrs;
	
	@PostMapping
	public ResponseEntity<PersonaTrait> save(@RequestBody PersonaTrait pt) {
		ptrs.save(pt);
		return ResponseEntity.ok(pt);
	}

	@GetMapping
	public List<PersonaTrait> findAll() {
		return ptrs.findAll();
	}

}
