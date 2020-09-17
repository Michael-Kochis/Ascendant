package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IAscendantTraitDAO;
import com.kiragames.model.AscendantTrait;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class AscendantTraitService {
	
	@Autowired
	private IAscendantTraitDAO dao;
	
	public void save(AscendantTrait trait) {
		dao.save(trait);
	}

	public List<AscendantTrait> findAll() {
		return dao.findAll();
	}

}
