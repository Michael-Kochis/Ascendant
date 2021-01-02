package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IFacilityDAO;
import com.kiragames.model.Facility;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class FacilityService {
	
	@Autowired
	private IFacilityDAO dao;
	
	public void save(Facility fac) {
		dao.save(fac);
	}

	public List<Facility> findAll() {
		return dao.findAll();
	}

}
