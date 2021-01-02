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

import com.kiragames.model.TemplateSkill;
import com.kiragames.service.TemplateSkillService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/template/skill", "/skill/template"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TemplateSkillController {
	
	@Autowired
	private TemplateSkillService tss;
	
	@PostMapping
	public ResponseEntity<TemplateSkill> save(@RequestBody TemplateSkill ts) {
		tss.save(ts);
		return ResponseEntity.ok(ts);
	}

	@GetMapping
	public List<TemplateSkill> findAll() {
		return tss.findAll();
	}

}
