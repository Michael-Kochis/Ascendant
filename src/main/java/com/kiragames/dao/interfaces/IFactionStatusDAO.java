package com.kiragames.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.FactionStatus;
import com.kiragames.model.FactionStatusID;

@Repository
public interface IFactionStatusDAO extends JpaRepository<FactionStatus, FactionStatusID> {
	public List<FactionStatus> findByLeftID(long id);
	public List<FactionStatus> findByRightID(long id);
	public List<FactionStatus> findByRelationID(long id);

}
