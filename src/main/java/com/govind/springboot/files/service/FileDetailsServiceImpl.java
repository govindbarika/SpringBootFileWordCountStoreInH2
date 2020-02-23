package com.govind.springboot.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.govind.springboot.files.model.FileDetailsModel;
import com.govind.springboot.files.repo.FileDetailsRepo;

@Service
public class FileDetailsServiceImpl implements IFileDetailsService{

	
	@Autowired
	private FileDetailsRepo repo;
	
	//@Override
	public void readDataFromFileAndStoreWordCountInDB() {
		// TODO Auto-generated method stub
		
		
		String line = "";
		int count = 0;
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\govin\\govind1-workspace\\Springboot-h2\\SpringBootFilesH2\\src\\main\\resources\\Data.txt"))){
			while((line=br.readLine()) != null) {
				count = count +line.split("").length;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		FileDetailsModel model = new FileDetailsModel();
		model.setFileName("Data.txt");
		model.setNumberOfWords(count);
		repo.save(model);
	}

	
}
