package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.Relation;

@Repository
public interface IRelationDAO extends JpaRepository<Relation, Integer> {

}
