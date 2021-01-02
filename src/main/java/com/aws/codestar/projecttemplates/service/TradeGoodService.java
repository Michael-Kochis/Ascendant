package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.ITradeGoodDAO;
import com.kiragames.model.TradeGood;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TradeGoodService {
	
	@Autowired
	private ITradeGoodDAO dao;
	
	public void save(TradeGood good) {
		dao.save(good);
	}

	public List<TradeGood> findAll() {
		return dao.findAll();
	}

}
