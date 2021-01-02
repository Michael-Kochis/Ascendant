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

import com.kiragames.model.FactionRelation;
import com.kiragames.service.FactionRelationService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/faction/relation", "/relation/faction"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class FactionRelationController {
	
	@Autowired
	private FactionRelationService frs;
	
	@PostMapping
	public ResponseEntity<FactionRelation> save(@RequestBody FactionRelation rel) {
		if (rel.getRelationID() == 0) {
			rel.setRelationID((long) frs.findMax()+1);
		}
		frs.save(rel);
		return ResponseEntity.ok(rel);
	}

	@GetMapping
	public List<FactionRelation> findAll() {
		return frs.findAll();
	}

}
