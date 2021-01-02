package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.AscendantTrait;

@Repository
public interface IAscendantTraitDAO extends JpaRepository<AscendantTrait, Integer> {

}
