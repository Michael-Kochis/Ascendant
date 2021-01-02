package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IRelationDAO;
import com.kiragames.model.Relation;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class RelationService {
	
	@Autowired
	private IRelationDAO dao;
	
	public void save(Relation relation) {
		dao.save(relation);
	}

	public List<Relation> findAll() {
		return dao.findAll();
	}

}
