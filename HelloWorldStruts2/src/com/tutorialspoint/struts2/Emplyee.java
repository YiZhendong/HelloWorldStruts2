package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * �ύ���Ķ���
 * 9/4/2016
 * @author zander_local
 *
 */
public class Emplyee extends ActionSupport {
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
