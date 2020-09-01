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

import com.kiragames.model.IPSource;
import com.kiragames.service.IPSourceService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/ipsource")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class IPSourceController {
	
	@Autowired
	private IPSourceService ipss;
	
	@PostMapping
	public ResponseEntity<IPSource> save(@RequestBody IPSource ips) {
		if (ips.getSourceID() == 0) {
			ips.setSourceID((long) ipss.findAll().size()+1);
		}
		ipss.save(ips);
		return ResponseEntity.ok(ips);
	}

	@GetMapping
	public List<IPSource> findAll() {
		return ipss.findAll();
	}

}
