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

import com.kiragames.model.Facility;
import com.kiragames.service.FacilityService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/facility", "/location/facility"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class FacilityController {
	
	@Autowired
	private FacilityService fs;
	
	@PostMapping
	public ResponseEntity<Facility> save(@RequestBody Facility fac) {
		fs.save(fac);
		return ResponseEntity.ok(fac);
	}

	@GetMapping
	public List<Facility> findAll() {
		return fs.findAll();
	}

}
