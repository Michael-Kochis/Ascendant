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

import com.kiragames.model.Relation;
import com.kiragames.service.RelationService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/relation")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class RelationController {
	
	@Autowired
	private RelationService rs;
	
	@PostMapping
	public ResponseEntity<Relation> save(@RequestBody Relation rel) {
		rs.save(rel);
		return ResponseEntity.ok(rel);
	}

	@GetMapping
	public List<Relation> findAll() {
		return rs.findAll();
	}

}
