<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Form</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
 <h1>Contacts List</h1>
 <a href="/contactForm">Add Contact</a>
 </br>
 </br>
 
 <table>
  <tr>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Email</th>
    <th>Phone Number</th>
    <th>Status</th>    
    <th>Actions</th>    
  </tr>
  
  <c:forEach var="contact" items="${contacts}">   
	  <tr>
	    <td>${contact.firstName}</td>
	    <td>${contact.lastName}</td>
	    <td>${contact.email}</td>
	    <td>${contact.phoneNumber}</td>
	    <td>${contact.status}</td>	     
	    <td>
	    	<a href="/edit/${contact.id}">Edit</a>
	    	<a href="/delete/${contact.id}">Delete</a>
	    </td> 
	  </tr>
  </c:forEach>

  
</table>
</body>
</html>