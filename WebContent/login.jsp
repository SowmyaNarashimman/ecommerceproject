<html>
<%@page import="java.sql.*" %>
<%
Connection con=null;
ResultSet rst=null;
Statement st=null;
try
{
	Class.forName("org.h2.Driver");
con=DriverManager.getConnection("Jdbc:h2:~/test","sowmya","sowsingh");
st=con.createStatement();
String un,pass;
un=request.getParameter("email");
pass=request.getParameter("pwd");
String query="Select username from table1 where emailid='"+un+"'AND password='"+pass+"'";
rst=st.executeQuery(query);
if(!rst.next())
{
	System.out.println("enter the correct username and password");
}
else
{
	String fname=rst.getString("username");
System.out.println(fname+"has an exiciting offers on all branded products");	
}
}
catch(Exception e)
{
System.out.println("login failed"+e);
}
%>

</html>