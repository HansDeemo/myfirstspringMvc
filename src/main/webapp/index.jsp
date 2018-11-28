<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
Bonjour
<form action="">
    <table>
        <c:forEach var="list" items="${list}">
            <tr>
                <td>${list.id}</td>
                <td>${list.name}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
