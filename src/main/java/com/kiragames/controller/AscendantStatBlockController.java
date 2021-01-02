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

import com.kiragames.model.AscendantStatBlock;
import com.kiragames.service.AscendantStatBlockService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/ascendantstat")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class AscendantStatBlockController {
	
	@Autowired
	private AscendantStatBlockService mss;
	
	@PostMapping
	public ResponseEntity<AscendantStatBlock> save(@RequestBody AscendantStatBlock asb) {
		mss.save(asb);
		return ResponseEntity.ok(asb);
	}

	@GetMapping
	public List<AscendantStatBlock> findAll() {
		return mss.findAll();
	}

}
