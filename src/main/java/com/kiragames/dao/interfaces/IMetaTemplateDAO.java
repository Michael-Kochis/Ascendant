package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.MetaTemplate;

@Repository
public interface IMetaTemplateDAO extends JpaRepository<MetaTemplate, MetaTemplate> {
	public List<MetaTemplate> findByMetaID(long id);
	public List<MetaTemplate> findByTemplateID(long id);

}
