package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IYipYipDAO;
import com.kiragames.model.YipYip;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
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
