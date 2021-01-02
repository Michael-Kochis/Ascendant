package com.kiragames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@NamedQuery(name="Persona.getMax", query="SELECT COUNT(personaID) from Persona")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class Persona {
	@Id
	@PositiveOrZero
	private long personaID;
	
	@Column
	private String namae;
	
	@Column
	@PositiveOrZero
	private long sourceID;
	

}
