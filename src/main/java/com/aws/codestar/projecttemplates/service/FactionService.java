package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IFactionDAO;
import com.kiragames.model.Faction;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class FactionService {
	
	@Autowired
	private IFactionDAO dao;
	
	public void save(Faction faction) {
		dao.save(faction);
	}

	public List<Faction> findAll() {
		return dao.findAll();
	}

}
