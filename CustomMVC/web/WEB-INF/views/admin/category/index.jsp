<%-- 
    Document   : index
    Created on : Nov 18, 2016, 1:25:23 PM
    Author     : zak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Category</title>
    </head>
    <body>
        <h1>Categories</h1>
        <ul>
            <c:forEach var="category" items="${requestScope.categories}">
                <li>${category.name}</li>
            </c:forEach>
        </ul>
    </body>
</html>
