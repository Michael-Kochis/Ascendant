package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.PersonaRelationDAO;
import com.kiragames.model.PersonaRelation;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaRelationService {
	
	@Autowired
	private PersonaRelationDAO dao;
	
	public void save(PersonaRelation pr) {
		dao.save(pr);
	}

	public List<PersonaRelation> findAll() {
		return dao.findAll();
	}
	
	public List<PersonaRelation> findByLeftID(long id) {
		return dao.findByLeftID(id);
	}
	
	public List<PersonaRelation> findByRightID(long id) {
		return dao.findByRightID(id);
	}
	
	public List<PersonaRelation> findByRelationID(long id) {
		return dao.findByRelationID(id);
	}
	

}
