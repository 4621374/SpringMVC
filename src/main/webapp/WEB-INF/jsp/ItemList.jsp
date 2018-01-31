<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%" border="1">
<tr><td>商品名</td><td>商品价格</td><td>商品描述</td></tr>
<c:forEach items="${items}" var="item">
<tr>
<td>${item.name}</td><td>${item.price}</td><td>${item.detail}</td>
</tr>
</c:forEach>
</table>
</body>
</html>