package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.FactionRelation;

@Repository
public interface IFactionRelationDAO extends JpaRepository<FactionRelation, Integer> {

	long findMax();

}
