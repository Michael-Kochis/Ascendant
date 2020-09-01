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

import com.kiragames.model.PersonaFaction;
import com.kiragames.service.PersonaFactionService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/persona/faction", "/faction/persona"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaFactionController {
	
	@Autowired
	private PersonaFactionService pfs;
	
	@PostMapping
	public ResponseEntity<PersonaFaction> save(@RequestBody PersonaFaction pf) {
		pfs.save(pf);
		return ResponseEntity.ok(pf);
	}

	@GetMapping
	public List<PersonaFaction> findAll() {
		return pfs.findAll();
	}

}
