package com.example.project.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Message {

	   private String message = "Hello World!";
		
	   public String getMessage() {
	      return message;
	   }
	   public void setMessage(String message) {
	      this.message = message;
	   }

}
