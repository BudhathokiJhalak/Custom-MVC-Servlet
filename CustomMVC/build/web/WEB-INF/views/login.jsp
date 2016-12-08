<%-- 
    Document   : login
    Created on : Nov 18, 2016, 12:50:26 PM
    Author     : zak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <c:if test="${param.error!=null}">
            Invalid UserName and Password
        </c:if>
        <form method="post">
            <div>
                <label>UserName</label>
                <input type="text" name="username"/>
            </div>
            <div>
                <label>Password</label>
                <input type="password" name="password"/>
            </div>
            <button type="submit">Login</button>
        </form>
    </body>
</html>
