package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.ITemplateDAO;
import com.kiragames.model.Template;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TemplateService {
	
	@Autowired
	private ITemplateDAO dao;
	
	public void save(Template template) {
		dao.save(template);
	}

	public List<Template> findAll() {
		return dao.findAll();
	}

}
