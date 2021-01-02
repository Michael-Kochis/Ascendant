package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.Alias;

@Repository
public interface IAliasDAO extends JpaRepository<Alias, Integer> {

}
