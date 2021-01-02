package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.PersonaSkill;
import com.kiragames.model.PersonaSkillID;

@Repository
public interface IPersonaSkillDAO extends JpaRepository<PersonaSkill, PersonaSkillID> {
	public List<PersonaSkill> findBySkillID(long id);

	public List<PersonaSkill> findByPersonaID(long id);

}
