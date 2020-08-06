package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IMetaTemplateDAO;
import com.kiragames.model.MetaTemplate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class MetaTemplateService {
	
	@Autowired
	private IMetaTemplateDAO dao;
	
	public void save(MetaTemplate mt) {
		dao.save(mt);
	}

	public List<MetaTemplate> findAll() {
		return dao.findAll();
	}
	
	public List<MetaTemplate> findByMetaID(long id) {
		return dao.findByMetaID(id);
	}
	
	public List<MetaTemplate> findByTemplateID(long id) {
		return dao.findByTemplateID(id);
	}
	

}
