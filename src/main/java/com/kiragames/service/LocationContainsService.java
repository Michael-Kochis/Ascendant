package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.ILocationContainsDAO;
import com.kiragames.model.LocationContains;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class LocationContainsService {
	
	@Autowired
	private ILocationContainsDAO dao;
	
	public void save(LocationContains lcont) {
		dao.save(lcont);
	}

	public List<LocationContains> findAll() {
		return dao.findAll();
	}

}
