<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
    String printMultiTable1()
    {
     String s = "";
     for(int i=1;i<=9;i++)
     {
       for(int j=1;j<=i;j++)
       {
        s+=i+"*"+j+"="+(i*j)+"    ";
       }
       s+="<br>";
     }
     return s;
    }
   void printMultiTable2(JspWriter out) throws Exception
    {
      for(int i=1;i<=9;i++)
      {
       for(int j=1;j<=i;j++)
       {
        out.println(i+"*"+j+"="+(i*j)+"    ");
       }
       out.println ("<br>");      }
    }
   
  %>
  <h1> Nine-nine multiplication table</h1>
  <hr>
  <%=printMultiTable1()%>
  <br>
  <% printMultiTable2(out);%>
  <br>

</body>
</html>