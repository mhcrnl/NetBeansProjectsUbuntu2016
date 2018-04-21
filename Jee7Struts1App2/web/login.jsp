<%-- 
    Document   : login
    Created on : Feb 10, 2016, 7:07:54 PM
    Author     : mhcrnl
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LoginForm</title>
    </head>
    <body>
        <h1>LoginForm!</h1>
        
        <html:form action="/login">
            <table border="0">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Numele dvs:</td>
                        <td><html:text property="name" /></td>
                    </tr>
                    <tr>
                        <td>Email-uldvs:</td>
                        <td><html:text property="email" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><html:submit value="Login" /></td>
                    </tr>
                </tbody>
            </table>

            
            
        </html:form>
    </body>
</html>
