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

import com.kiragames.model.Skill;
import com.kiragames.service.SkillService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/skill")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class SkillController {
	
	@Autowired
	private SkillService sks;
	
	@PostMapping
	public ResponseEntity<Skill> save(@RequestBody Skill skill) {
		if (skill.getSkillID() == 0) {
			skill.setSkillID((long)sks.findAll().size()+1);
		}
		sks.save(skill);
		return ResponseEntity.ok(skill);
	}

	@GetMapping
	public List<Skill> findAll() {
		return sks.findAll();
	}

}
