package com.example.project.view;

import java.io.Serializable;  

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Named;

@Named
@RequestScoped
public class NavigationController implements Serializable {
	private static final long serialVersionUID = 1L;  
	   @ManagedProperty(value = "#{param.pageId}")    
	   private String pageId;  
	   
	   public String moveToPage1() {      
	      return "page1";    
	   }  
	   
	   public String moveToPage2() {       
	      return "page2";    
	   }  
	   
	   public String moveToHomePage() {      
	      return "navi";    
	   }  
	   
	   public String processPage1() {       
	      return "page";    
	   }  
	   
	   public String processPage2() {       
	      return "page";    
	   } 
	   
	   public String showPage() {       
	      if(pageId == null) {          
	         return "navi";       
	      }       
	      
	      if(pageId.equals("1")) {          
	         return "page1";       
	      }else if(pageId.equals("2")) {          
	         return "page2";       
	      }else {          
	         return "navi";       
	      }    
	   }  
	   
	   public String getPageId() {       
	      return pageId;    
	   }  
	   
	   public void setPageId(String pageId) {       
	      this.pageId = pageId;   
	   } 

}
