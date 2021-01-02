package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.Template;
import com.kiragames.model.TemplateContains;
import com.kiragames.model.TemplateContainsID;

@Repository
public interface ITemplateContainsDAO extends JpaRepository<TemplateContains, TemplateContainsID> {

}
