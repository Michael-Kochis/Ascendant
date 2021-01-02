package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.Meta;

@Repository
public interface IMetaDAO extends JpaRepository<Meta, Long> {

}
