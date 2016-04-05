package com.tutorialspoint.struts2;  
  
import com.opensymphony.xwork2.ActionContext;  
import com.opensymphony.xwork2.ActionSupport;  
  
public class HelloWorldAction extends ActionSupport {  
    //定义封装请求参数的age
	private int age;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 定义封装请求参数的username和password属性  
    private String name;  
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
  
    // 定义处理用户请求的execute方法  
    public String execute() throws Exception {   
    	if ("secret".equals(name)){
    		System.out.println("Now is inside the process");
    		return "success";
    	}else{
    		return "error";
    	}    
    } 
    
    public void validate () {
    	if (name==null || name.trim().equals("")){
    		addFieldError("name","The name is required");
    	}else if (age<20||age>40){
    		addFieldError("age","The age should be in (20,40)");
    	}
    	
    }
}  