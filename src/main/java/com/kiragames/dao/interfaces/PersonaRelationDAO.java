package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.PersonaRelation;

@Repository
public interface PersonaRelationDAO extends JpaRepository<PersonaRelation, PersonaRelation> {
	public List<PersonaRelation> findByLeftID(long id);
	public List<PersonaRelation> findByRightID(long id);
	public List<PersonaRelation> findByRelationID(long id);

}
