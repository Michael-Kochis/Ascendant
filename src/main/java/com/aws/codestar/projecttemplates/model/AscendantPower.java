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
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode(callSuper=true) @ToString
public class AscendantPower extends Power {
	@Id
	@PositiveOrZero
	private long powerID;

	@Column
	private String powerName;
	
	@Column
	@PositiveOrZero
	private long baseCost;

	@Column
	@PositiveOrZero
	private float levelCost;

	@Column
	private String defaultRating;
}
