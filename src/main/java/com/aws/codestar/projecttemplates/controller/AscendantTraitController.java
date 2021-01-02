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

import com.kiragames.model.AscendantTrait;
import com.kiragames.service.AscendantTraitService;
import com.kiragames.service.TraitService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/ascendanttrait", "/trait/ascendant"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class AscendantTraitController {
	
	@Autowired
	private AscendantTraitService atrs;
	@Autowired
	private TraitService trs;
	
	@PostMapping
	public ResponseEntity<AscendantTrait> save(@RequestBody AscendantTrait trait) {
		if (trait.getTraitID() == 0) {
			trait.setTraitID((long) trs.getMax()+1);
		}
		atrs.save(trait);
		return ResponseEntity.ok(trait);
	}

	@GetMapping
	public List<AscendantTrait> findAll() {
		return atrs.findAll();
	}

}
