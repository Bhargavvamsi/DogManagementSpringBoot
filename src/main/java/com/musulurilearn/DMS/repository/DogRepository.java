package com.musulurilearn.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.musulurilearn.DMS.Models.Dog;

/**
*
* @author BhargavVamsiMusuluri
*/

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List <Dog> findByName(String name);
}
