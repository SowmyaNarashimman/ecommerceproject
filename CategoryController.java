package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Category;
import com.niit.dao.CategoryDAO;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categorydao;
	
	@RequestMapping(value="addcat", method=RequestMethod.GET)
	public ModelAndView sendCategory(@ModelAttribute("category")Category category)
	{
		ModelAndView mv=new ModelAndView("addcategory");
		return mv;
	}
	
	
	@RequestMapping(value="addcat", method=RequestMethod.POST)
	public ModelAndView getCategory(Category category)
	{
		
		categorydao.addCategory(category);
		ModelAndView mv=new ModelAndView("login","category",new Category());
		return mv;		
		
	}
	
	
}
