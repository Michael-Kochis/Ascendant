package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.Trait;

@Repository
public interface ITraitDAO extends JpaRepository<Trait, Integer> {
	long getMax();
}
