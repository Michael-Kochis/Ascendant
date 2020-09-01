package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.Skill;

@Repository
public interface ISkillDAO extends JpaRepository<Skill, Integer> {

}
