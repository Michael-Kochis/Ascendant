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

import com.kiragames.model.TemplatePower;
import com.kiragames.service.TemplatePowerService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/template/power", "/power/template", "/templatepower"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TemplatePowerController {
	
	@Autowired
	private TemplatePowerService tps;
	
	@PostMapping
	public ResponseEntity<TemplatePower> save(@RequestBody TemplatePower tp) {
		tps.save(tp);
		return ResponseEntity.ok(tp);
	}

	@GetMapping
	public List<TemplatePower> findAll() {
		return tps.findAll();
	}

}
