package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.GoodClass;

@Repository
public interface IGoodClassDAO extends JpaRepository<GoodClass, Integer> {

}
