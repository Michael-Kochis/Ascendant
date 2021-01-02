package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.AscendantStatBlock;

@Repository
public interface IAscendantStatBlock extends JpaRepository<AscendantStatBlock, Long> {

}
