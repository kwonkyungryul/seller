<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

    <h1>Update Page</h1>
    <hr/>
    <form action="/product/${product.id}/update" method="post">
        <table border="1">
            <tr>
                <th>번호</th>
                <th>물품명</th>
                <th>가격</th>
                <th>재고</th>
                <th>등록일</th>
            </tr>
            <tr>
                <td><input type="text" name="id" id="" value="${product.id}" readonly></td>
                <td><input type="text" name="name" id="" value="${product.name}"></td>
                <td><input type="text" name="price" id="" value="${product.price}"></td>
                <td><input type="text" name="qty" id="" value="${product.qty}"></td>
                <td><input type="text" name="createdAt" id="" value="${product.createdAt}" readonly></td>
            </tr>
        </table>
        <input type="submit" value="수정하기">
    </form>
<%@ include file="../layout/footer.jsp" %>