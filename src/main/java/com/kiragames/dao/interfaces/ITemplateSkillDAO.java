package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.TemplateSkill;
import com.kiragames.model.TemplateSkillID;

@Repository
public interface ITemplateSkillDAO extends JpaRepository<TemplateSkill, TemplateSkillID> {
	public List<TemplateSkill> findBySkillID(long id);

}
