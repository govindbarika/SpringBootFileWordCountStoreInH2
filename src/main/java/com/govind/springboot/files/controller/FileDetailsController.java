package com.govind.springboot.files.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.govind.springboot.files.service.IFileDetailsService;

@RestController
public class FileDetailsController {

	@Autowired
	private IFileDetailsService fileService;
	
	@RequestMapping("/saveFileCount")
	public String saveFileCount() {
		fileService.readDataFromFileAndStoreWordCountInDB();	
		return "File word count returned to dB";
	}
}
