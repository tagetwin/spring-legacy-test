<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	${username}님 홈에 오신것을 환영합니다.
</h1>

	<form action="/springlegacy/hello" method="post">
		<input type="hidden" name="id" value="ssar">
		<input type="hidden" name="pw" value="1234">
		<button type="submit">hello 페이지로 이동 button</button>
	</form>

	<form action="/springlegacy/hello" method="post">
		<input type="hidden" name="id" value="ssar">
		<input type="hidden" name="pw" value="1234">
		<input type="submit" value="hello 페이지로 이동 input" />
	</form>
	<a href="/springlegacy/hello">hello 페이지로 이동</a>

</body>
</html>
