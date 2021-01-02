package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IHouseDAO;
import com.kiragames.model.House;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class HouseService {
	
	@Autowired
	private IHouseDAO dao;
	
	public void save(House house) {
		dao.save(house);
	}

	public List<House> findAll() {
		return dao.findAll();
	}

	public House findHouseByID(long id) {
		return dao.findHouseByFactionID(id);
	}
}
