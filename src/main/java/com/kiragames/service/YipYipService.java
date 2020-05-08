package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IYipYipDAO;
import com.kiragames.model.YipYip;

@Service
public class YipYipService {
	
	@Autowired
	private IYipYipDAO dao;
	
	public void save(YipYip yy) {
		dao.save(yy);
	}

	public List<YipYip> findAll() {
		return dao.findAll();
	}

}
