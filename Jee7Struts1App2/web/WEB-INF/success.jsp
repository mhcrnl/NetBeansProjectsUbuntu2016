<%-- 
    Document   : success
    Created on : Feb 10, 2016, 7:14:03 PM
    Author     : mhcrnl
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LoginSuccess</title>
    </head>
    <body>
        <h1>Sunte-ti logat in aplicatie!</h1>
        <p>Numele dvs:<bean:write name="LoginForm" property="name" /> .</p>
        
        <p>Adresa de mail:<bean:write name="LoginForm" property="email" /> .</p>
    </body>
</html>
