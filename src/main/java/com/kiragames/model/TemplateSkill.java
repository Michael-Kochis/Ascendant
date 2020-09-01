package com.kiragames.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@IdClass(TemplateSkillID.class)
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class TemplateSkill implements Serializable {
	private static final long serialVersionUID = 6215218735639948826L;

	@Column
	@Positive
	@Id
	private long templateID;
	
	@Column
	@Positive
	@Id
	private long skillID;
	
	@Column
	@PositiveOrZero
	private long rating;
	
}
