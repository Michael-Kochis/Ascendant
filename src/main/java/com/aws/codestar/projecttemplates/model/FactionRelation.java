package com.kiragames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@NamedQuery(name="FactionRelation.findMax", query="SELECT COUNT(relationID) from FactionRelation")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class FactionRelation {
	@Id
	@PositiveOrZero
	private long relationID;

	@Column
	private String relationName;
}
