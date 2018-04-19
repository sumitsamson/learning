package com.springmvc.controllers;

import java.sql.DatabaseMetaData;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MainController {
	
	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String viewHomeDefault(ModelMap model) {

		return "redirect:/home";
	}
	

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String viewHome(ModelMap model) {
		DatabaseMetaData metadata;
		String url = "";
		String username = "";
		String database = "";
		String exception = "";
		String db_host = System.getenv("db_host");
		System.out.println("DB Host ="+db_host);
		
		try {
			metadata = datasource.getConnection().getMetaData();
			url = metadata.getURL();
			username = metadata.getUserName();
			database = metadata.getDatabaseProductName();
			
		} catch (Exception e) {
			
			e.printStackTrace();
            exception = e.getMessage();			
		}
		
		model.addAttribute("db_host",db_host);
		model.addAttribute("db_url",url);
		model.addAttribute("db_username", username);
		model.addAttribute("db_name", database);
		model.addAttribute("db_exception", exception);
			

		return "/home";
	}
	
	


}
