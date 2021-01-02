package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IAscendantStatBlock;
import com.kiragames.model.AscendantStatBlock;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class AscendantStatBlockService {
	
	@Autowired
	private IAscendantStatBlock dao;
	
	public void save(AscendantStatBlock asb) {
		dao.save(asb);
	}

	public List<AscendantStatBlock> findAll() {
		return dao.findAll();
	}

}
