package com.example.project.view;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorld2 {
    private String input;
    private String output;
    public void submit() {
        output = "Hello World! You have typed: " + input;
    }
    
    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }
    public String getOutput() {
        return output;
    }
}
