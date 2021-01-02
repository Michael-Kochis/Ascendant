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

import com.kiragames.model.AscendantSkill;
import com.kiragames.service.AscendantSkillService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/ascendantskill", "/skill/ascendant"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class AscendantSkillController {
	
	@Autowired
	private AscendantSkillService asks;
	
	@PostMapping
	public ResponseEntity<AscendantSkill> save(@RequestBody AscendantSkill skill) {
		if (skill.getSkillID() == 0) {
			skill.setSkillID((long) asks.findAll().size()+1);
		}
		asks.save(skill);
		return ResponseEntity.ok(skill);
	}

	@GetMapping
	public List<AscendantSkill> findAll() {
		return asks.findAll();
	}

}
