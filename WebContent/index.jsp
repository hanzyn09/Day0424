<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<% 
	String name = "홍길동";
	String path = request.getContextPath();
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String[] arr = {"aaa", "bbb", "ccc"}; %>

안녕하세요 <%=name %> 님! <br> 
<p>path : <%=path %></p>
<jsp:include page="/common/menu.jsp"></jsp:include>

<c:forEach var="n" items="${arr }">
	<p><c:out value="${n}"></c:out></p>
</c:forEach>
<%--el 태그와 혼용해서 쓸 수 있다. (Thymeleaf를 많이 씀)--%>

</body>
</html>