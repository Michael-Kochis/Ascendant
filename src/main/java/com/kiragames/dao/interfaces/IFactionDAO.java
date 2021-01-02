package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.Faction;

@Repository
public interface IFactionDAO extends JpaRepository<Faction, Integer> {

}
