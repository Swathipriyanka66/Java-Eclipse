<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<table border="3" align="center">
     <th>Exponent</th>
     <th>3^Exponent</th>
     <% for (int i=0; i<=10; i++) {  %>
            <tr>
                <td><%= i%></td>
                <td><%= Math.pow(3, i) %></td>
            </tr>
     <% }  %>
</table>

</body>
</html>