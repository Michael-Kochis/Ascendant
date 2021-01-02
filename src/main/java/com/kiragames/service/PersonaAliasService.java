package com.kiragames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiragames.dao.interfaces.IPersonaAliasDao;
import com.kiragames.model.PersonaAlias;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaAliasService {
	
	@Autowired
	private IPersonaAliasDao dao;
	
	public void save(PersonaAlias ma) {
		dao.save(ma);
	}

	public List<PersonaAlias> findAll() {
		return dao.findAll();
	}
	
	public List<PersonaAlias> findByPersonaID(long id) {
		return dao.findByPersonaID(id);
	}
	
	public List<PersonaAlias> findByaliasID(long id) {
		return dao.findByAliasID(id);
	}
	

}
