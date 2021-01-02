package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IAscendantSkillDAO;
import com.kiragames.model.AscendantSkill;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class AscendantSkillService {
	
	@Autowired
	private IAscendantSkillDAO dao;
	
	public void save(AscendantSkill skill) {
		dao.save(skill);
	}

	public List<AscendantSkill> findAll() {
		return dao.findAll();
	}

}
