package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionInvocation;
import java.util.*;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor{
	public String intercept(ActionInvocation invocation)throws Exception{
		/*let's do something about pre-process*/
		String output="Pre-Process";
		System.out.println("output");
		/*let's call action or next interceptor*/
		
		String result = invocation.invoke();
		
		//do something about post-process
		output = "Post-Process";
		System.out.println(output);
		 return result;
	}
}
