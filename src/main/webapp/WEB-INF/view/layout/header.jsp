<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<ul>
    <c:if test="${principal == null}" >
        <li><a href="/">홈</a></li>
        <li><a href="/loginForm">로그인</a></li>
    </c:if>
    <c:if test="${principal != null}" >
        <li><a href="/">홈</a></li>
        <li><a href="/product/addForm">물품등록</a></li>
        <li><a href="/logout">로그아웃</a></li>
    </c:if>
</ul>