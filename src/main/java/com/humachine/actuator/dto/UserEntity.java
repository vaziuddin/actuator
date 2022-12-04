package com.humachine.actuator.dto;

import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonGetter;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@Component
@RequiredArgsConstructor
public class UserEntity {
	
	public int id;
	private String name;
	
	
	public UserEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@JsonGetter
	public String getName() {
		return name;
	}
	
	
	
	

}
