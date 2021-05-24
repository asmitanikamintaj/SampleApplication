<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>      
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
        <h2>Edit Contact</h2>
        <form:form action="/add" method="post" modelAttribute="contact">
        	<form:hidden path="id"/>
        	<br/>
        	
            <form:label path="firstName">Full name:</form:label>
            <form:input path="firstName"/><br/>
            
             <form:label path="lastName">Last name:</form:label>
            <form:input path="lastName"/><br/>
             
            <form:label path="email">E-mail:</form:label>
            <form:input path="email"/><br/>
            
             <form:label path="phoneNumber">Phone Number:</form:label>
            <form:input path="phoneNumber"/><br/>
                       
                 
            <form:button>Edit</form:button>
        </form:form>
    </div>

</body>
</html>