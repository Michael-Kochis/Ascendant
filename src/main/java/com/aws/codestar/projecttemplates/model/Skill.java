package com.kiragames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@Table(name="SKILL")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class Skill {
	@Id
	@PositiveOrZero
	private long skillID;

	@Column
	private String skillName;
}
