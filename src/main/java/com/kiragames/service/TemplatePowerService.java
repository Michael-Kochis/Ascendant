package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.ITemplatePowerDAO;
import com.kiragames.model.TemplatePower;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TemplatePowerService {
	
	@Autowired
	private ITemplatePowerDAO dao;
	
	public void save(TemplatePower tpower) {
		dao.save(tpower);
	}

	public List<TemplatePower> findAll() {
		return dao.findAll();
	}

}
