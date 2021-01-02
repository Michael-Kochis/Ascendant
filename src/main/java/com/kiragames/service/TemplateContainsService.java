package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.ITemplateContainsDAO;
import com.kiragames.model.TemplateContains;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TemplateContainsService {
	
	@Autowired
	private ITemplateContainsDAO dao;
	
	public void save(TemplateContains tcont) {
		dao.save(tcont);
	}

	public List<TemplateContains> findAll() {
		return dao.findAll();
	}

}
