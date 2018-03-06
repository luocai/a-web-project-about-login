<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
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
  	${msg }
    <form action = "${pageContext.request.contextPath }/LoginServlet" method = "POST"> 
   学号：<input type = "text" name = "num" /> <br>
   密码：<input type = "text" name = "pass"/> <br>
   <input type = "submit" name = "登录"/>
     </form>
     <a href = "${pageContext.request.contextPath }/ToRegisterServlet">注册</a> 
  </body>
</html>
