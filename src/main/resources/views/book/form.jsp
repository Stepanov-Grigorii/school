<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Обновления книг</title>
</head>
<body>
<h1>
    <c:if test="${book.id eq null}">
        Регистрация книги
    </c:if>
    <c:if test="${book.id ne null}">
        Редактирование книги
    </c:if>
</h1>
<c:url value="/books/save" var="savelink"/>
<form:form method="post" action="${savelink}" autocomplete="false" modelAttribute="book">
    <p>
        <form:label path="name">Название:</form:label>
        <form:input path="name" autocomplete="false"/>
    </p>
    <p>

    </p>
</form:form>
</body>
</html>