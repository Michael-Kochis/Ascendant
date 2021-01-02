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

import com.kiragames.model.PersonaAlias;
import com.kiragames.service.PersonaAliasService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/persona/alias","/alias/persona"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaAliasController {
	
	@Autowired
	private PersonaAliasService pas;
	
	@PostMapping
	public ResponseEntity<PersonaAlias> save(@RequestBody PersonaAlias pa) {
		pas.save(pa);
		return ResponseEntity.ok(pa);
	}
	
	@GetMapping
	public List<PersonaAlias> findAll() {
		return pas.findAll();
	}

}
