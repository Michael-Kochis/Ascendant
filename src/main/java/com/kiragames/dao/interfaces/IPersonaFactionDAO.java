package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.PersonaFaction;
import com.kiragames.model.PersonaFactionID;

@Repository
public interface IPersonaFactionDAO extends JpaRepository<PersonaFaction, PersonaFactionID> {
	public List<PersonaFaction> findByFactionID(long id);

}
