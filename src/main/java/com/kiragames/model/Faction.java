package com.kiragames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
public class Faction {
	@Id
	@PositiveOrZero
	@GeneratedValue
	private long factionID;
	
	@Column
	@PositiveOrZero
	private long sourceID;

	@Column
	private String factionName;
}
