package com.the.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestController
 */
//@WebServlet("/TestController")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/*get과 post는 요청방법만 다를 뿐 서버의 처리는 같다
	 * 보안이 필요한 데이터를 보낼 때엔 POST 활용. (보이지 않는다)*/
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//jsp 페이지로 지정해서 보내준다. 주소가 다르다.
		//1. request 이용해서 페이지 이동 : 요청할때마다 새로. /TestController. 주로 쓴다.
		RequestDispatcher rd = request.getRequestDispatcher("test01.jsp"); //요청객체는 직접 처리할 수 없어서 객체값을 이용해서 실행해야한다.
		rd.forward(request, response);
		
		
		//2. response 이용해서 페이지 이동 : 요청이 두번이루어졌다. /test01.jsp. 테스트컨트롤러를 요청해도 서버에게 변경을 재요청한다.
		//response.sendRedirect("/Day0424/test01.jsp"); //url 주소를 바꿔달라는 의미. 데이터가 존재하지않는다.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
