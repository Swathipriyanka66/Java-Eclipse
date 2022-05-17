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
	int number=8;  
	int flag=0;  
	for(int i=2;i<=(number-1);i++)  
	{  
  
    if(number%i==0)  
    {  
        flag=1;  
        break;  
    }  
	}  
  
	if(flag==0)  
	{  
    out.println("Prime Number");  
	}  
	else  
	{  
    out.println("Not a Prime Number");  
	}  
  
	%>  

</body>
</html>