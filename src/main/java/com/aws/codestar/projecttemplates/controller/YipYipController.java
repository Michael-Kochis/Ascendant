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

import com.kiragames.model.YipYip;
import com.kiragames.service.YipYipService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/yipyip")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class YipYipController {
	
	@Autowired
	private YipYipService yys;
	
	@PostMapping
	public ResponseEntity<YipYip> save(@RequestBody YipYip yy) {
		yys.save(yy);
		return ResponseEntity.ok(yy);
	}

	@GetMapping
	public List<YipYip> findAll() {
		return yys.findAll();
	}

}
