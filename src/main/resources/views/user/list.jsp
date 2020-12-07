<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 29.10.2020
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Список пользователей</title>
</head>
<body>
    <ul>
        <c:forEach var="user" items="${users}">
            <li>
                <c:url value="/users/form/${user.id}" var="editUser"/>
                ${user.id} ${user.login} <a href="${editUser}"><button>Редактировать</button></a>
            </li>
        </c:forEach>
    </ul>
    <c:url value="/users/form" var="newUser"/>
    <a href="${newUser}"><button>Добавить пользователя</button></a>
</body>
</html>