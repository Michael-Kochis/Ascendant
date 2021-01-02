package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.Power;

@Repository
public interface IPowerDAO extends JpaRepository<Power, Integer> {

}
