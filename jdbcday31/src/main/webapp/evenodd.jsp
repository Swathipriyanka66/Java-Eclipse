<

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Print Even & Odd Numbers</title>
</head>
<body>
<%
out.print("<b>First 10 Even numbers are</><br>");
for( int i=1;i<=20;i++)
{
    if(i%2==0)
{
    out.print("<br><b>"+i+"</b>");
}
}
out.print("<br><br><b> First 10 odd numbers are</b><br>");
for( int i=1;i<=20;i++)
{
    if(i%2!=0)
{
    out.print("<br><b>"+i+"</b>");
}
}
%>
</body>
</html>

</body>
</html>