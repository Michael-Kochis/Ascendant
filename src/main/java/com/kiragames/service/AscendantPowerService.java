package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IAscendantPowerDAO;
import com.kiragames.model.AscendantPower;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class AscendantPowerService {
	
	@Autowired
	private IAscendantPowerDAO dao;
	
	public void save(AscendantPower power) {
		dao.save(power);
	}

	public List<AscendantPower> findAll() {
		return dao.findAll();
	}

}
