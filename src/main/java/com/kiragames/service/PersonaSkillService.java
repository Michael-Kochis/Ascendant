package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IPersonaSkillDAO;
import com.kiragames.model.PersonaSkill;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaSkillService {
	
	@Autowired
	private IPersonaSkillDAO dao;
	
	public void save(PersonaSkill ms) {
		dao.save(ms);
	}

	public List<PersonaSkill> findAll() {
		return dao.findAll();
	}
	
	public List<PersonaSkill> findByPersonaID(long id) {
		return dao.findByPersonaID(id);
	}
	
	public List<PersonaSkill> findBySkillID(long id) {
		return dao.findBySkillID(id);
	}
	

}
