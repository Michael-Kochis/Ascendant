package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.Template;

@Repository
public interface ITemplateDAO extends JpaRepository<Template, Integer> {

}
