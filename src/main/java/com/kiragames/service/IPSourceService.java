package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IIPSourceDAO;
import com.kiragames.model.IPSource;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class IPSourceService {
	
	@Autowired
	private IIPSourceDAO dao;
	
	public void save(IPSource ips) {
		dao.save(ips);
	}

	public List<IPSource> findAll() {
		return dao.findAll();
	}

}
