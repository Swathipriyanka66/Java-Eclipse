
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="Contacts" action="beanaction.jsp" method="post">
   Enter name:<input type="text" name="fname"><br/>
   
   Enter mobile:<input type="text" name="mobile"><br/>
  
   Click to send data<input type="submit" value="send"><br/>
   <input type="reset"value="clean"><br>

<h2>check....</h2>

<jsp:useBean id="userBean" class="ai.jobiak.contacts.java" scope="request"></jsp:useBean>
<jsp:setProperty name="userBean" property="name" param="name"/>
<jsp:setProperty name="userBean" property="mobile" param="mobile"/>

<h3>Your Data is{
First Name:<jsp:getProperty name="userBean" property="name"/><br>

Mobile :<jsp:getProperty name="userBean" property="mobile"/><br>
</h3>
<hr>
<jsp:forward page="showbeandata.jsp"></jsp:forward>
</body>
</html>
