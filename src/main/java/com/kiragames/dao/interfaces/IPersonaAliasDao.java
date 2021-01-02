package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.PersonaAlias;
import com.kiragames.model.PersonaAliasID;

@Repository
public interface IPersonaAliasDao extends JpaRepository<PersonaAlias, PersonaAliasID> {
	public List<PersonaAlias> findByPersonaID(long id);
	public List<PersonaAlias> findByAliasID(long id);

}
