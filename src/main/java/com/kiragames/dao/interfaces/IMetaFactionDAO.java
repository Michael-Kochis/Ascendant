package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.MetaFaction;

@Repository
public interface IMetaFactionDAO extends JpaRepository<MetaFaction, MetaFaction> {
	public List<MetaFaction> findByFactionID(long id);

}
