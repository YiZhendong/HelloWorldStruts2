<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=GBK">  
<title><s:text name="loginPage"/></title>  
</head>  
<body>  
<form action="upload" method="post" enctype="multipart/form-data">  
    <label>Please Upload Your File</label>
    <input type="file" name="myFile"/>
    <input type="submit" value="upload"/>
</form>  
</body>  
</html>  