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

import com.kiragames.model.Alias;
import com.kiragames.service.AliasService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/alias")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class AliasController {
	
	@Autowired
	private AliasService as;
	
	@PostMapping
	public ResponseEntity<Alias> save(@RequestBody Alias alias) {
		if (alias.getAliasID() == 0) {
			alias.setAliasID((long) as.findAll().size()+1);
		}
		as.save(alias);
		return ResponseEntity.ok(alias);
	}

	@GetMapping
	public List<Alias> findAll() {
		return as.findAll();
	}

}
