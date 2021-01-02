package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IPersonaTraitDAO;
import com.kiragames.model.PersonaTrait;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaTraitService {
	
	@Autowired
	private IPersonaTraitDAO dao;
	
	public void save(PersonaTrait pt) {
		dao.save(pt);
	}

	public List<PersonaTrait> findAll() {
		return dao.findAll();
	}
	
	public List<PersonaTrait> findByPersonaID(long id) {
		return dao.findByPersonaID(id);
	}
	
	public List<PersonaTrait> findByTraitID(long id) {
		return dao.findByTraitID(id);
	}
	

}
