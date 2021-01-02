package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.LocationContains;
import com.kiragames.model.LocationContainsID;

@Repository
public interface ILocationContainsDAO extends JpaRepository<LocationContains, LocationContainsID> {

}
