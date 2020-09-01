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

import com.kiragames.model.TradeGood;
import com.kiragames.service.TradeGoodService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RestController
@CrossOrigin
@RequestMapping("/good")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TradeGoodController {
	
	@Autowired
	private TradeGoodService tgs;
	
	@PostMapping
	public ResponseEntity<TradeGood> save(@RequestBody TradeGood good) {
		if (good.getGoodID() == 0) {
			good.setGoodID((long) tgs.findAll().size()+1); 
		}
		tgs.save(good);
		return ResponseEntity.ok(good);
	}

	@GetMapping
	public List<TradeGood> findAll() {
		return tgs.findAll();
	}

}
