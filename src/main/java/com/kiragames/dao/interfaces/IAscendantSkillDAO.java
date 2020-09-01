package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.AscendantSkill;

@Repository
public interface IAscendantSkillDAO extends JpaRepository<AscendantSkill, Integer> {

}
