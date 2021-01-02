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

import com.kiragames.model.Trait;
import com.kiragames.service.TraitService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/trait")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TraitController {
	
	@Autowired
	private TraitService trs;
	
	@PostMapping
	public ResponseEntity<Trait> save(@RequestBody Trait trait) {
		if (trait.getTraitID() == 0) {
			trait.setTraitID(trs.getMax()+1);
		}
		trs.save(trait);
		return ResponseEntity.ok(trait);
	}

	@GetMapping
	public List<Trait> findAll() {
		return trs.findAll();
	}

}
