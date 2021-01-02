package com.kiragames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiragames.model.House;
import com.kiragames.service.HouseService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/house")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class HouseController {
	
	@Autowired
	private HouseService hs;
	
	@PostMapping
	public ResponseEntity<House> save(@RequestBody House rh) {
		hs.save(rh);
		return ResponseEntity.ok(rh);
	}

	@GetMapping
	public List<House> findAll() {
		return hs.findAll();
	}
	
	@GetMapping("/id/{id}") 
	public House findHouseByID(@PathVariable long id) {
		return hs.findHouseByID(id);
	}

}
