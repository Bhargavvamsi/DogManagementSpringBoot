package com.musulurilearn.DMS.repository;

/**
*
* @author BhargavVamsiMusuluri
*/ 

import org.springframework.data.repository.CrudRepository;

import com.musulurilearn.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
	
}
