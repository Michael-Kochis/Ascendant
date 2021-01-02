package com.kiragames.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class YipYip {
	
	@Id
	private String message;
}
