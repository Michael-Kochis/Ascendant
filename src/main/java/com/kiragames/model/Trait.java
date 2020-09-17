package com.kiragames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
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
@NamedQuery(name="Trait.getMax", query="SELECT MAX(traitID) from Trait")
@Table(name="TRAIT")
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class Trait {
	@Id
	@PositiveOrZero
	private long traitID;

	@Column
	private String traitName;
}
