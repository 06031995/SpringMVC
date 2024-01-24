<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>This is about</h1>

  <h1> Name is ${name}</h1>
  <h1>Date is ${date}</h1>
  <h1>Id = ${Id}</h1>
  <h1>${list}</h1>
  
  <form action="">
    <label>first Name</label>
    <input type="text" name="name" id="name"><br><br>
    <label>Last Name</label>
    <input type="text" name ="lname" id="lname"><br><br>
    <label>Town</label>
    <select>
      <option value="0">select</option>
      <option value="1">jamner</option>
      <option value="2">Jalgaon</option>
      <option value="3">pune</option>
    </select>
  </form>
</body>
</html>