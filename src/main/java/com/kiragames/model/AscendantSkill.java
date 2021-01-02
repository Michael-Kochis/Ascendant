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
public class AscendantSkill extends Skill {
	@Id
	@PositiveOrZero
	private long skillID;

	@Column
	private String skillName;
	
	@Column
	@PositiveOrZero
	private long baseCost;

	@Column
	@PositiveOrZero
	private long levelCost;

	@Column
	private String defaultRating;
}
