package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IAliasDAO;
import com.kiragames.model.Alias;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class AliasService {
	
	@Autowired
	private IAliasDAO dao;
	
	public void save(Alias alias) {
		dao.save(alias);
	}

	public List<Alias> findAll() {
		return dao.findAll();
	}

}
