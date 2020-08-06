package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IMetaRelationDAO;
import com.kiragames.model.MetaRelation;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class MetaRelationService {
	
	@Autowired
	private IMetaRelationDAO dao;
	
	public void save(MetaRelation mr) {
		dao.save(mr);
	}

	public List<MetaRelation> findAll() {
		return dao.findAll();
	}
	
	public List<MetaRelation> findByLeftID(long id) {
		return dao.findByLeftID(id);
	}
	
	public List<MetaRelation> findByRightID(long id) {
		return dao.findByRightID(id);
	}
	
	public List<MetaRelation> findByRelationID(long id) {
		return dao.findByRelationID(id);
	}
	

}
