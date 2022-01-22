package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.HumanRepo;
import com.example.demo.model.Human;

@Controller
public class MainController 
{
	@Autowired
	HumanRepo dao;
	
	@RequestMapping("/")
	public String home()
	{
		return "addHuman.jsp";
	}
	
	@RequestMapping("/addHuman")

	public String addHumans(Human human)
	{
		dao.save(human);
//		dao.findById(1);
		return "addHuman.jsp";
		
	}
	

}
