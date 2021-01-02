package com.kiragames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode(callSuper=false) @ToString
public class Meta extends Persona {

	@Id
	@PositiveOrZero
	private long personaID;
	
	@Column
	private String nomen;
	
	@Column
	private String namae;
	
	@Column
	@PositiveOrZero
	private long sourceID;
	
}
