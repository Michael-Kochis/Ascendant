package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.Persona;

@Repository
public interface IPersonaDAO extends JpaRepository<Persona, Long> {
	long getMax();
}
