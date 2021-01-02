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

import com.kiragames.model.AscendantPower;
import com.kiragames.service.AscendantPowerService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/ascendantpower", "/power/ascendant"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class AscendantPowerController {
	
	@Autowired
	private AscendantPowerService aps;
	
	@PostMapping
	public ResponseEntity<AscendantPower> save(@RequestBody AscendantPower power) {
		if (power.getPowerID() == 0) {
			power.setPowerID((long) aps.findAll().size()+1);
		}
		aps.save(power);
		return ResponseEntity.ok(power);
	}

	@GetMapping
	public List<AscendantPower> findAll() {
		return aps.findAll();
	}

}
