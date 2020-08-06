package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IMetaFactionDAO;
import com.kiragames.model.MetaFaction;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class MetaFactionService {
	
	@Autowired
	private IMetaFactionDAO dao;
	
	public void save(MetaFaction mr) {
		dao.save(mr);
	}

	public List<MetaFaction> findAll() {
		return dao.findAll();
	}
	
	public List<MetaFaction> findByFactionID(long id) {
		return dao.findByFactionID(id);
	}
	

}
