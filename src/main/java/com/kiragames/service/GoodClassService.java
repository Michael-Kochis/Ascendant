package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IGoodClassDAO;
import com.kiragames.model.GoodClass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class GoodClassService {
	
	@Autowired
	private IGoodClassDAO dao;
	
	public void save(GoodClass gc) {
		dao.save(gc);
	}

	public List<GoodClass> findAll() {
		return dao.findAll();
	}

}
