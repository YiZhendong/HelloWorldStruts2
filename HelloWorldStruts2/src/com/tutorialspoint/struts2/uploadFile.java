package com.tutorialspoint.struts2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class uploadFile extends ActionSupport {
	
	private File myFile;					//获取上传文件，名称必须和表单控件file控件名一样
	private String myFileContentType;		//上传文件类型	注意命名格式	myFile+ContentType
	private String myFileFileName;			//上传文件名		注意命名格式 myFile+FileName
	private String destPath;				//上传文件保存路径

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	public String execute() throws IOException {
		
		//copy the file to the safe path!!!
		destPath = "C:/A-Work";
		
			try {
				System.out.println("Source file name is " + myFile);
				System.out.println("Destination file name is " + myFileFileName);
				File destFile = new File(destPath,myFileFileName);
				FileUtils.copyFile(myFile,destFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "error";
			}
		return "success";
	}

}
