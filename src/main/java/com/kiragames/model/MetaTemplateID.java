package com.kiragames.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class MetaTemplateID implements Serializable {
	private static final long serialVersionUID = 6215218735639948826L;

	private long metaID;
	private long templateID;
	
}
