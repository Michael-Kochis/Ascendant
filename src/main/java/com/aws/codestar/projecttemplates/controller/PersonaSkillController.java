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

import com.kiragames.model.PersonaSkill;
import com.kiragames.service.PersonaSkillService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/persona/skill", "/skill/persona"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaSkillController {
	
	@Autowired
	private PersonaSkillService pss;
	
	@PostMapping
	public ResponseEntity<PersonaSkill> save(@RequestBody PersonaSkill ps) {
		pss.save(ps);
		return ResponseEntity.ok(ps);
	}

	@GetMapping
	public List<PersonaSkill> findAll() {
		return pss.findAll();
	}

}
