package com.kiragames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiragames.model.Persona;
import com.kiragames.service.PersonaService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/persona")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaController {
	
	@Autowired
	private PersonaService ps;
	
	@PostMapping
	public ResponseEntity<Persona> save(@RequestBody Persona person) {
		if (person.getPersonaID() == 0) {
//			person.setPersonaID((long)ps.findAll().size()+1);
			person.setPersonaID(ps.getMax()+1);
		}
		ps.save(person);
		return ResponseEntity.ok(person);
	}
	
	@GetMapping
	public List<Persona> findAll() {
		return ps.findAll();
	}

}
