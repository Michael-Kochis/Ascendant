package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.ISkillDAO;
import com.kiragames.model.Skill;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class SkillService {
	
	@Autowired
	private ISkillDAO dao;
	
	public void save(Skill skill) {
		dao.save(skill);
	}

	public List<Skill> findAll() {
		return dao.findAll();
	}

}
