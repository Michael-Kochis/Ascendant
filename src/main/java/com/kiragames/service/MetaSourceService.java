package com.kiragames.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IMetaSourceDAO;
import com.kiragames.model.MetaSource;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class MetaSourceService {
	
	@Autowired
	private IMetaSourceDAO dao;
	
	public void save(MetaSource ms) {
		dao.save(ms);
	}

	public List<MetaSource> findAll() {
		return dao.findAll();
	}
	
	public List<MetaSource> findByMetaID(long id) {
		return dao.findByMetaID(id);
	}
	
	public List<MetaSource> findBySourceID(long id) {
		return dao.findBySourceID(id);
	}
	

}
