<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

    <h1>Add Page</h1>
    <hr/>
    <form action="/product/add" method="post">
        <input type="text" name="name" id="" placeholder="Enter name" required><br/>
        <input type="text" name="price" id="" min="0" placeholder="Enter price" required><br/>
        <input type="text" name="qty" id="" min="0" placeholder="Enter qty" required><br/>
        <button type="submit">물품등록</button>
    </form>

<%@ include file="../layout/footer.jsp" %>