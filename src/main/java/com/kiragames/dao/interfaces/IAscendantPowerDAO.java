package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.AscendantPower;

@Repository
public interface IAscendantPowerDAO extends JpaRepository<AscendantPower, Integer> {

}
