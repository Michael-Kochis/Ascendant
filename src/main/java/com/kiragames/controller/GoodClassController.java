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

import com.kiragames.model.GoodClass;
import com.kiragames.service.GoodClassService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/good/class")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class GoodClassController {
	
	@Autowired
	private GoodClassService gcs;
	
	@PostMapping
	public ResponseEntity<GoodClass> save(@RequestBody GoodClass gc) {
		if (gc.getGoodClassID() == 0) {
			gc.setGoodClassID((long) gcs.findAll().size()+1);
		}
		gcs.save(gc);
		return ResponseEntity.ok(gc);
	}

	@GetMapping
	public List<GoodClass> findAll() {
		return gcs.findAll();
	}

}
