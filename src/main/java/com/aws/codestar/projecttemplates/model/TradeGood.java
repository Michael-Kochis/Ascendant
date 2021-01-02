package com.kiragames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Positive;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TradeGood  {
	@Column
	@Positive
	@Id
	private long goodID;
	
	@Column
	private String goodName;
	
	@Column
	@Positive
	private long goodClassID;
	
	@Column
	@Positive
	private long sourceID;
	
}
