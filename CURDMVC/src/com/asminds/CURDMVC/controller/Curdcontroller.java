package com.asminds.CURDMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asminds.CURDMVC.daoIMPL.RegistermodelIMPL;
import com.asminds.CURDMVC.model.Loginmodel;
import com.asminds.CURDMVC.model.Register;

@Controller
public class Curdcontroller {

	@RequestMapping("/")
	public String index() 
	{
		System.out.println("I'm in index method");
		return "index";   	// We should create index.jsp file after this step
		
	}
	
	@RequestMapping("/Validate")
	public String Validate(@ModelAttribute ("t") Loginmodel l)
	{
		System.out.println("useername and password");
		String username= l.getUsername();			// Database username and java username are same using this step
		String password=l.getPassword();			// Database password and java password are same using this step
		System.out.println("useername and password2");
		if(username.equals("admin") && password.equals("admin"))
		{
		System.out.println("I'm in validation");
		return "admin";
		}
		else
		{
			return "error";
		}
	}
	

	@RequestMapping("/register")
	public String register() 
	{
		System.out.println("I'm in register function");
		return "register";   	// We should create index.jsp file after this step
		
	}
	@RequestMapping("/save")
	public String save(@ModelAttribute ("t1") Register r)
	{
	System.out.println("Saving processing");
	System.out.println(r.getName());
	System.out.println(r.getDept());
	System.out.println(r.getClg());
	System.out.println("Enterned values saved in DB1 ");
	RegistermodelIMPL obj =new RegistermodelIMPL();
	obj.save(r);
	System.out.println("Enterned values saved in DB2 ");
	return "Regsus";
	}
}
