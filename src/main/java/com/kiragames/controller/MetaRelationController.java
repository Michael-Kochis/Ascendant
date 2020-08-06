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

import com.kiragames.model.MetaRelation;
import com.kiragames.service.MetaRelationService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/meta/relation", "/relation/meta"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class MetaRelationController {
	
	@Autowired
	private MetaRelationService mrs;
	
	@PostMapping
	public ResponseEntity<MetaRelation> save(@RequestBody MetaRelation mr) {
		mrs.save(mr);
		return ResponseEntity.ok(mr);
	}

	@GetMapping
	public List<MetaRelation> findAll() {
		return mrs.findAll();
	}

}
