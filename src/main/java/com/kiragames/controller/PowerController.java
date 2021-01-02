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

import com.kiragames.model.Power;
import com.kiragames.service.PowerService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/power")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PowerController {
	
	@Autowired
	private PowerService ps;
	
	@PostMapping
	public ResponseEntity<Power> save(@RequestBody Power power) {
		if (power.getPowerID() == 0) {
			power.setPowerID((long)ps.findAll().size()+1);
		}
		ps.save(power);
		return ResponseEntity.ok(power);
	}

	@GetMapping
	public List<Power> findAll() {
		return ps.findAll();
	}

}
