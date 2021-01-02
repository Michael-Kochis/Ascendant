package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.ITemplateSkillDAO;
import com.kiragames.model.TemplateSkill;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TemplateSkillService {
	
	@Autowired
	private ITemplateSkillDAO dao;
	
	public void save(TemplateSkill tskill) {
		dao.save(tskill);
	}

	public List<TemplateSkill> findAll() {
		return dao.findAll();
	}

}
