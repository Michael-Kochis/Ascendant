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

import com.kiragames.model.FactionStatus;
import com.kiragames.service.FactionStatusService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping({"/faction/status", "/status/faction", "factionstatus"})
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class FactionStatusController {
	
	@Autowired
	private FactionStatusService fss;
	
	@PostMapping
	public ResponseEntity<FactionStatus> save(@RequestBody FactionStatus fs) {
		fss.save(fs);
		return ResponseEntity.ok(fs);
	}

	@GetMapping
	public List<FactionStatus> findAll() {
		return fss.findAll();
	}

}
