package com.govind.springboot.files.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class FileDetailsModel {
	
	@Id	
	@GeneratedValue
	private int fileDetailsModelId;
	
	private String fileName;
	
	private int numberOfWords;
	
}
