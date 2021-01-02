package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.TemplatePower;
import com.kiragames.model.TemplatePowerID;

@Repository
public interface ITemplatePowerDAO extends JpaRepository<TemplatePower, TemplatePowerID> {
	public List<TemplatePower> findByPowerID(long id);

}
