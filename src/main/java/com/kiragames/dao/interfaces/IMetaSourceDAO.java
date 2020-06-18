package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.MetaSource;

@Repository
public interface IMetaSourceDAO extends JpaRepository<MetaSource, MetaSource> {
	public List<MetaSource> findByMetaID(long id);
	public List<MetaSource> findBySourceID(long id);

}
