<%-- 
    Document   : index
    Created on : Nov 17, 2016, 1:09:06 PM
    Author     : zak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${param.success}</h1>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
            <c:forEach var="customer" items="${requestScope.customers}">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.firstName} ${customer.lastName}</td>
                    <td>${customer.email}</td>
                </tr>
            </c:forEach>
        </table>
        <form method="post">
            <input type="text" name="name"/>
            <button type="submit">Send</button>
        </form>
    </body>
</html>
