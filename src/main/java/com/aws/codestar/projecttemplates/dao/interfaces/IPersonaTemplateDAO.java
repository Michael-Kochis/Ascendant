package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.PersonaTemplate;

@Repository
public interface IPersonaTemplateDAO extends JpaRepository<PersonaTemplate, PersonaTemplate> {
	public List<PersonaTemplate> findByPersonaID(long id);
	public List<PersonaTemplate> findByTemplateID(long id);

}
