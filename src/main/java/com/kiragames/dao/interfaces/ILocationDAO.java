package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.Location;

@Repository
public interface ILocationDAO extends JpaRepository<Location, Integer> {

}
