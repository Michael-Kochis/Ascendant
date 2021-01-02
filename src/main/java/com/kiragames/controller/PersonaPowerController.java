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

import com.kiragames.model.PersonaPower;
import com.kiragames.service.PersonaPowerService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/persona/power", "/power/persona","/personapower"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaPowerController {
	
	@Autowired
	private PersonaPowerService mps;
	
	@PostMapping
	public ResponseEntity<PersonaPower> save(@RequestBody PersonaPower mp) {
		mps.save(mp);
		return ResponseEntity.ok(mp);
	}

	@GetMapping
	public List<PersonaPower> findAll() {
		return mps.findAll();
	}

}
