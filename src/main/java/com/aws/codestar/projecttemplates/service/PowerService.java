package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IPowerDAO;
import com.kiragames.model.Power;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PowerService {
	
	@Autowired
	private IPowerDAO dao;
	
	public void save(Power power) {
		dao.save(power);
	}

	public List<Power> findAll() {
		return dao.findAll();
	}

}
