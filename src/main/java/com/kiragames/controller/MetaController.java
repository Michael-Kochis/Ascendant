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

import com.kiragames.model.MetaSource;
import com.kiragames.service.MetaSourceService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/metasource")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class MetaController {
	
	@Autowired
	private MetaSourceService mss;
	
	@PostMapping
	public ResponseEntity<MetaSource> save(@RequestBody MetaSource ms) {
		mss.save(ms);
		return ResponseEntity.ok(ms);
	}

	@GetMapping
	public List<MetaSource> findAll() {
		return mss.findAll();
	}

}