package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.ILocationDAO;
import com.kiragames.model.Location;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class LocationService {
	
	@Autowired
	private ILocationDAO dao;
	
	public void save(Location location) {
		dao.save(location);
	}

	public List<Location> findAll() {
		return dao.findAll();
	}

}
