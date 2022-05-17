
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"import="java.util.*;"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp@Jobiak</title>
</head>
<body>
<%!
	int a=10;	
	
	public int cube(int n) {
	
			return n*n*n;
}
	ArrayList<String>topics= new ArrayList();

	%>
<h1>
<h2>
<h3>
	5^3 is:
    <%=cube(5) %></h3>
<h3>
	<%
	topics.add("html,css.JS");
	topics.add("Typescript and Angular 10");
	topics.add("SpringBook.Hibernate&JPA");
	topics.add("GIT,JENKINS,JUNIT&AWS");
	for(String topic:topics){
		out.println(topic+"<br/");
	}
	%>
	<h3>Elements in arraylist<%=topics.size() %></h3>
</h3>
<%=new String("Welcome Jobiak Java Giants+Hulks+Marvel's") %>
</h1>
<h2>
<% out.println("You can write Java in tags=which are known as scriptlets/expressions/declarations/comments");
   out.println(a);%></h2>

</body>
</html>