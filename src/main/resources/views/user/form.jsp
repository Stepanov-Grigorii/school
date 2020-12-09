<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 29.10.2020
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Редактирование пользователя</title>
</head>
<body>
<h1>
    <c:if test="${user.id eq null}">
        Создание пользователя
    </c:if>
    <c:if test="${user.id ne null}">
        Редактирование пользователя
    </c:if>
</h1>
<c:url value="/users/save" var="savelink"/>
<form:form method="post" action="${savelink}" autocomplete="false" modelAttribute="user">
    <p>
        <form:label path="login">Логин:</form:label>
        <form:input path="login" autocomplete="false"/>
    </p>
    <p>
        <form:label path="password">Пароль:</form:label>
        <form:input path="password" type="password" autocomplete="false"/>
    </p>
    <form:hidden path="id"/>
    <input type="submit" value="Сохранить"/>
</form:form>
</body>
</html>