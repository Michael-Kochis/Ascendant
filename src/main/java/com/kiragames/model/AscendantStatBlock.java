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
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class AscendantStatBlock {

	@Id
	@PositiveOrZero
	private long personaID;
	
	@Column(name="MIG")
	private int might;

	@Column(name="AGL")
	private int agility;

	@Column(name="VAL")
	private int valor;

	@Column(name="RES")
	private int resolve;

	@Column(name="INS")
	private int insight;

	@Column(name="CHA")
	private int charisma;

}
