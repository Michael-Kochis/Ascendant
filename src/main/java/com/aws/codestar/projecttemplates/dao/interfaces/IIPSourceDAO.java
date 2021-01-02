package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.IPSource;

@Repository
public interface IIPSourceDAO extends JpaRepository<IPSource, Integer> {

}
