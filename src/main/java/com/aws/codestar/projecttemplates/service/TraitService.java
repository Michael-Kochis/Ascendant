package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.ITraitDAO;
import com.kiragames.model.Trait;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TraitService {
	
	@Autowired
	private ITraitDAO dao;
	
	public void save(Trait trait) {
		dao.save(trait);
	}

	public List<Trait> findAll() {
		return dao.findAll();
	}
	
	public long getMax() {
		return dao.getMax();
	}

}
