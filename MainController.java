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
		return "addHuman.jsp";
	}
	
	@RequestMapping("/getHumanById")
	public ModelAndView getHumansById(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("viewHuman.jsp");
		Human human =repo.findById(id).orElse(new Human());
		mv.addObject(human);
		return mv;
	}
	
	@RequestMapping("/getHumansByCity")
	public ModelAndView getHumansByCity(@RequestParam String city)
	{
		ModelAndView mv = new ModelAndView("viewHumansList.jsp");
		List<Human> human =repo.findByCity(city);
		System.out.println(human);
		mv.addObject(human);
		return mv;
	}
	
	@RequestMapping("/getHumansByCountry")
	public ModelAndView getHumansByCountry(@RequestParam String country)
	{
		ModelAndView mv = new ModelAndView("viewHumansList.jsp");
		List<Human> human =repo.findByCountry(country);
		System.out.println(human);
		mv.addObject(human);
		return mv;
	}
	
	@RequestMapping("/getHumansByCitySortedByName")
	public ModelAndView getHumansByCitySortedByName(@RequestParam String city)
	{
		ModelAndView mv = new ModelAndView("viewHumansList.jsp");
		List<Human> human =repo.findByCitySortedByName(city);
		System.out.println(human);
		mv.addObject(human);
		return mv;
	}
	

}
