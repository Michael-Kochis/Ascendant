package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.YipYip;

@Repository
public interface IYipYipDAO extends JpaRepository<YipYip, String> {

}
