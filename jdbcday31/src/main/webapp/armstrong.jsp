<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int num = 27;
	int n = num;
	int rem,no = 0;
	while(n!=0)
	{
	rem = n%10;
	no = no+rem*rem*rem;
	n = n/10;
	}
	if(no == num)
	{
	out.println("\nArmstrong Number");
	}
	else
	{
	out.println("Not Armstrong");
	}
	%>
</body>
</html>