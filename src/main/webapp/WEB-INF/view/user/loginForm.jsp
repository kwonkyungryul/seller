<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

    <h1>Login Page</h1>
    <hr/>
    <form action="/login" method="post">
        <input type="text" name="username" id="" placeholder="Enter username" required><br/>
        <input type="password" name="password" id="" min="0" placeholder="Enter password" required><br/>
        <button type="submit">로그인</button>
    </form>

<%@ include file="../layout/footer.jsp" %>