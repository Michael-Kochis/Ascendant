package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IPersonaTemplateDAO;
import com.kiragames.model.PersonaTemplate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaTemplateService {
	
	@Autowired
	private IPersonaTemplateDAO dao;
	
	public void save(PersonaTemplate mt) {
		dao.save(mt);
	}

	public List<PersonaTemplate> findAll() {
		return dao.findAll();
	}
	
	public List<PersonaTemplate> findByPersonaID(long id) {
		return dao.findByPersonaID(id);
	}
	
	public List<PersonaTemplate> findByTemplateID(long id) {
		return dao.findByTemplateID(id);
	}
	

}
