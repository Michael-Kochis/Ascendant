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

import com.kiragames.model.Location;
import com.kiragames.service.LocationService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/location")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class LocationController {
	
	@Autowired
	private LocationService ls;
	
	@PostMapping
	public ResponseEntity<Location> save(@RequestBody Location loc) {
		if (loc.getLocationID() == 0) {
			loc.setLocationID((long) ls.findAll().size()+1);
		}
		ls.save(loc);
		return ResponseEntity.ok(loc);
	}

	@GetMapping
	public List<Location> findAll() {
		return ls.findAll();
	}

}
