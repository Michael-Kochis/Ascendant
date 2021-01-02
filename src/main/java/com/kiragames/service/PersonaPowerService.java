package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IPersonaPowerDAO;
import com.kiragames.model.PersonaPower;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaPowerService {
	
	@Autowired
	private IPersonaPowerDAO dao;
	
	public void save(PersonaPower mp) {
		dao.save(mp);
	}

	public List<PersonaPower> findAll() {
		return dao.findAll();
	}
	
	public List<PersonaPower> findByPersonaID(long id) {
		return dao.findByPersonaID(id);
	}
	
	public List<PersonaPower> findByPowerID(long id) {
		return dao.findByPowerID(id);
	}
	

}
