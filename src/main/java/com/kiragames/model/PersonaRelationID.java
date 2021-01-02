package com.kiragames.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class PersonaRelationID implements Serializable {
	private static final long serialVersionUID = 6215218735639948826L;

	private long leftID;
	private long relationID;
	private long rightID;
	
}
