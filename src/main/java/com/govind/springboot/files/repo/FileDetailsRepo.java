package com.govind.springboot.files.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.govind.springboot.files.model.FileDetailsModel;

@Repository
public interface FileDetailsRepo extends CrudRepository<FileDetailsModel, Integer> {

}
