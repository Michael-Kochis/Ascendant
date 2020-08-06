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

import com.kiragames.model.Faction;
import com.kiragames.service.FactionService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/faction")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class FactionController {
	
	@Autowired
	private FactionService rs;
	
	@PostMapping
	public ResponseEntity<Faction> save(@RequestBody Faction rel) {
		rs.save(rel);
		return ResponseEntity.ok(rel);
	}

	@GetMapping
	public List<Faction> findAll() {
		return rs.findAll();
	}

}
