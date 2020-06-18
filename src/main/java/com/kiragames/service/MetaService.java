package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IMetaDAO;
import com.kiragames.model.Meta;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class MetaService {
	
	@Autowired
	private IMetaDAO dao;
	
	public void save(Meta meta) {
		dao.save(meta);
	}

	public List<Meta> findAll() {
		return dao.findAll();
	}

}
