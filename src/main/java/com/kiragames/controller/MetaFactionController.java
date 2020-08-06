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

import com.kiragames.model.MetaFaction;
import com.kiragames.service.MetaFactionService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/meta/faction", "/faction/meta"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class MetaFactionController {
	
	@Autowired
	private MetaFactionService mfs;
	
	@PostMapping
	public ResponseEntity<MetaFaction> save(@RequestBody MetaFaction mf) {
		mfs.save(mf);
		return ResponseEntity.ok(mf);
	}

	@GetMapping
	public List<MetaFaction> findAll() {
		return mfs.findAll();
	}

}
