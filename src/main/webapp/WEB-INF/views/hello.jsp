<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	헬로우 페이지에 오신것을 환영합니다.</br>
	아이디 : ${id}</br>
	패스워드 : ${pw}
</h1>

<a href="/springlegacy/goodbye?addr=부산&hobby=농구"> goodbye페이지로 이동</a>

</body>
</html>
