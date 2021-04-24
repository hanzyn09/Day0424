<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/common/menu.jsp"></jsp:include> 
<%-- 상대경로(../) : . 두개이면 위의 폴더로 이동해서 찾게 한다.
	 절대경로를 사용하기 위해서 컨트롤러를 활용하도록 한다. ==> 내장 객체 request 활용
	 <%=request.getContextPath()%>
 --%>
테스트03페이지입니다.
</body>
</html>