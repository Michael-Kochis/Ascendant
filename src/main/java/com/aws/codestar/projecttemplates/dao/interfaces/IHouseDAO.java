package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.House;

@Repository
public interface IHouseDAO extends JpaRepository<House, Integer> {
	public House findHouseByFactionID(long id);

}
