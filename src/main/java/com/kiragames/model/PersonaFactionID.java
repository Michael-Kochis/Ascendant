package com.kiragames.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaFactionID implements Serializable {
	private static final long serialVersionUID = 6215218735639948826L;

	private long personaID;
	private long factionID;
	
}
