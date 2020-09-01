package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.PersonaPower;
import com.kiragames.model.PersonaPowerID;

@Repository
public interface IPersonaPowerDAO extends JpaRepository<PersonaPower, PersonaPowerID> {
	public List<PersonaPower> findByPowerID(long id);

	public List<PersonaPower> findByPersonaID(long id);

}
