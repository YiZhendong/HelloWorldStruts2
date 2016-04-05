<%@ page language="java" contentType="text/html; charset=GBK"  
    pageEncoding="GBK"%>  
<%@taglib prefix="s" uri="/struts-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
    <title>Hello World</title>  
<meta http-equiv="Content-Type" content="text/html; charset=GBK">  
</head>  
<body>    
		<s:form action="empinfo" method="post">
			<s:textfield name="name" label="Name" size="20"/>
			<s:textfield name="age"  label="Age"  size="20"/>
			<s:submit name="submit" label="Submit" align="center"/>
		</s:form>
        <!--Hello World,<s:property value="name"/>    --> 
</body>  
</html> 