<%-- 
    Document   : response
    Created on : Jan 9, 2016, 7:05:03 AM
    Author     : mhcrnl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="name" />
        <h1>Hello World, <jsp:getProperty name="mybean" property="name" />!</h1>
        <jsp:setProperty name="mybean" property="IARBuc" />
        <h2>Index apa rece bucatarie: <jsp:getProperty name="mybean" property="IARBuc"/></h2>
         <jsp:setProperty name="mybean" property="IACBuc" />
        <h2>Index apa calda bucatarie: <jsp:getProperty name="mybean" property="IACBuc"/></h2>
        <jsp:setProperty name="mybean" property="IARBaie" />
        <h2>Index apa calda bucatarie: <jsp:getProperty name="mybean" property="IARBaie"/></h2>
        <jsp:setProperty name="mybean" property="IACBaie" />
        <h2>Index apa calda bucatarie: <jsp:getProperty name="mybean" property="IACBaie"/></h2>
        <jsp:setProperty name="mybean" property="gaze" />
        <h2>Index gaze: <jsp:getProperty name="mybean" property="gaze"/></h2>
        
    </body>
</html>
