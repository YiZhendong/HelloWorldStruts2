<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Several languages test page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1><s:text name="global.heading"/></h1>
    
    <s:url id="indexEN" namespace="/" action="locale">
    	<s:param name"request_locale">en</s:param>
    </s:url>
     <s:url id="indexES" namespace="/" action="locale">
    	<s:param name"request_locale">es</s:param>
    </s:url>
     <s:url id="indexFR" namespace="/" action="locale">
    	<s:param name"request_locale">fr</s:param>
    </s:url>
    
    <s:a href="%{indexEN}">English</s:a>
    <s:a href="%{indexEs}">Spanish</s:a>
    <s:a href="%{indexEN}">French</s:a>
    
    <s:form action="language" method="post" namespace="/">
    	<s:textfield name="name" key="global.name" size="20"/>
    	<s:textfield name="name" key="global.age" size="20"/>
    	<s:input name="submit" key="global.submit" ?/>
    </s:form>
  </body>
</html>
