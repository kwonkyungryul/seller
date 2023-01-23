<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

    <h1>Main Page</h1>
    <hr/>
    <table border="1">
        <tr>
            <th>번호</th>
            <th>물품명</th>
            <th>가격</th>
            <th>재고</th>
            <th>등록일</th>
        </tr>
        <c:forEach items="${productList}" var="product">
            <tr>
                <td>${product.id}</td>
                <td><a href="/product/${product.id}">${product.name}</a></td>
                <td>${product.price}</td>
                <td>${product.qty}</td>
                <td>${product.createdAt}</td>
            </tr>
        </c:forEach>
    </table>

<%@ include file="../layout/footer.jsp" %>