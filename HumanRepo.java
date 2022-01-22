package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Human;

public interface HumanRepo extends CrudRepository<Human, Integer>
{
  List<Human> findByCity(String city);
	
	List<Human> findByCountry(String country);
	
	List<Human> findByIdGreaterThan(int id);
	
	
	// Our Custom  JPQL QUERY
	@Query("from Human where city=?1 order by name")
	List<Human> findByCitySortedByName(String city);
}
