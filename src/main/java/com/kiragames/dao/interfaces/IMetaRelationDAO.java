package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.MetaRelation;

@Repository
public interface IMetaRelationDAO extends JpaRepository<MetaRelation, MetaRelation> {
	public List<MetaRelation> findByLeftID(long id);
	public List<MetaRelation> findByRightID(long id);
	public List<MetaRelation> findByRelationID(long id);

}
