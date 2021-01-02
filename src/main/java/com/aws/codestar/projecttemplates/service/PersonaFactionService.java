package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IPersonaFactionDAO;
import com.kiragames.model.PersonaFaction;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaFactionService {
	
	@Autowired
	private IPersonaFactionDAO dao;
	
	public void save(PersonaFaction mr) {
		dao.save(mr);
	}

	public List<PersonaFaction> findAll() {
		return dao.findAll();
	}
	
	public List<PersonaFaction> findByFactionID(long id) {
		return dao.findByFactionID(id);
	}
	

}
