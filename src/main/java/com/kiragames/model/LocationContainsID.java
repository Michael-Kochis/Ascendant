package com.kiragames.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class LocationContainsID implements Serializable {
	private static final long serialVersionUID = 2441935623210262908L;

	private long locationID;
	private long containsID;
	
}
