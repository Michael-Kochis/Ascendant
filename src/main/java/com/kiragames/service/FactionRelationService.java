package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IFactionRelationDAO;
import com.kiragames.model.FactionRelation;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class FactionRelationService {
	
	@Autowired
	private IFactionRelationDAO dao;
	
	public void save(FactionRelation relation) {
		dao.save(relation);
	}

	public List<FactionRelation> findAll() {
		return dao.findAll();
	}

	public long findMax() {
		return dao.findMax();
	}

}
