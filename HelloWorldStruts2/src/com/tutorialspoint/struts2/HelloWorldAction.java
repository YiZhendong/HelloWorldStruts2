package com.tutorialspoint.struts2;  
  
import com.opensymphony.xwork2.ActionContext;  
import com.opensymphony.xwork2.ActionSupport;  
  
public class HelloWorldAction extends ActionSupport {  
    // �����װ���������username��password����  
    private String name;  
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
  
    // ���崦���û������execute����  
    public String execute() throws Exception {   
    	if ("secret".equals(name)){
    		System.out.println("Now is inside the process");
    		return "success";
    	}else{
    		return "error";
    	}    
    }  
}  