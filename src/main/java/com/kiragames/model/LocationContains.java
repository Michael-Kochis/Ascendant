package com.kiragames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.Positive;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@IdClass(LocationContainsID.class)
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class LocationContains  {
	@Column
	@Positive
	@Id
	private long locationID;
	
	@Column
	@Positive
	@Id
	private long containsID;
	
}
