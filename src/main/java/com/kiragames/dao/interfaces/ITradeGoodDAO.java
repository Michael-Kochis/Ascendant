package com.kiragames.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiragames.model.TradeGood;

@Repository
public interface ITradeGoodDAO extends JpaRepository<TradeGood, Integer> {

}
