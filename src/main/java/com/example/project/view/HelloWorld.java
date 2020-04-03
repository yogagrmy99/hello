package com.example.project.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloWorld started!");
	   }
		
	public String getMessage() {
	      return "Hello World!";
	}
	
	

}
