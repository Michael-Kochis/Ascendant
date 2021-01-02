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

import com.kiragames.model.LocationContains;
import com.kiragames.service.LocationContainsService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/location/contains")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class LocationContainsController {
	
	@Autowired
	private LocationContainsService tcs;
	
	@PostMapping
	public ResponseEntity<LocationContains> save(@RequestBody LocationContains lc) {
		tcs.save(lc);
		return ResponseEntity.ok(lc);
	}

	@GetMapping
	public List<LocationContains> findAll() {
		return tcs.findAll();
	}

}
