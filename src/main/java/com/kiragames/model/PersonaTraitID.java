package com.kiragames.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaTraitID implements Serializable {
	private static final long serialVersionUID = -7962895582027446732L;

	private long personaID;
	private long traitID;
	
}
