package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Human;

public interface HumanRepo extends CrudRepository<Human, Integer>
{

}
