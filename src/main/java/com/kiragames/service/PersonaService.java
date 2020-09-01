package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IPersonaDAO;
import com.kiragames.model.Persona;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaService {
	
	@Autowired
	private IPersonaDAO dao;
	
	public void save(Persona person) {
		dao.save(person);
	}
	
	public long getMax() {
		return dao.getMax();
	}
	
	public List<Persona> findAll() {
		return dao.findAll();
	}

}
