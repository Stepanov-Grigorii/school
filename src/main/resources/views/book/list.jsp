<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Список книг</title>
</head>
<body>
    <ul>
        <c:forEach var="book" items="${books}">
            <li>
                <c:url value="/books/form/${book.id}" var="editBook"/>
                ${book.id} ${book.name} ${book.date} ${book.user} <a href="${editBook}"><button>Редактировать</button></a>
            </li>
        </c:forEach>
    </ul>
    <c:url value="/books/form" var="newBook"/>
    <a href="${newBook}"><button>Добавить книгу</button></a>
</body>
</html>