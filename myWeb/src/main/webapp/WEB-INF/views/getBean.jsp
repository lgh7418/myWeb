<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
	<li>아이디: ${user.uid} </li>
	<li>비밀번호: ${user.upw} </li>
	<li>이름: ${user.uname }</li>
	<li>닉네임: ${user.nick }</li>
	<li>이메일: ${user.email }</li>
	<li>주소: ${user.addr }</li>
	<li>휴대폰: ${user.phone }</li>
</ul>
</body>
</html>