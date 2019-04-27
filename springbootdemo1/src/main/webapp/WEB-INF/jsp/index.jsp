<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="itme" items="${user}">
    <p>
        <span>${itme.id}</span>||<span>${itme.name}</span>||<span>${itme.age}</span>
    </p>
</c:forEach>
</body>
</html>
