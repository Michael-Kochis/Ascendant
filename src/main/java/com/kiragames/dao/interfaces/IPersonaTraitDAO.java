package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.PersonaTrait;
import com.kiragames.model.PersonaTraitID;

@Repository
public interface IPersonaTraitDAO extends JpaRepository<PersonaTrait, PersonaTraitID> {
	public List<PersonaTrait> findByTraitID(long id);

	public List<PersonaTrait> findByPersonaID(long id);

}
