package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IFactionStatusDAO;
import com.kiragames.model.FactionStatus;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class FactionStatusService {
	
	@Autowired
	private IFactionStatusDAO dao;
	
	public void save(FactionStatus fs) {
		dao.save(fs);
	}

	public List<FactionStatus> findAll() {
		return dao.findAll();
	}
	
	public List<FactionStatus> findByLeftID(long id) {
		return dao.findByLeftID(id);
	}
	
	public List<FactionStatus> findByRightID(long id) {
		return dao.findByRightID(id);
	}
	
	public List<FactionStatus> findByRelationID(long id) {
		return dao.findByRelationID(id);
	}
	

}
