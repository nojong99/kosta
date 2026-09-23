<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<h1>ok.jsp</h1>
	
	<a href="loginUI">로그인</a>
	<!-- 무엇인가를 주는 페이지 set 
		 테스트하는 동선이 중요! 순서가 달라지면 결과가 다름
		 servlet -> Action 에서 처리
	-->
	<h1>server memory</h1>
	<%
		application.setAttribute("info", "모든 서버가 공유");
		session.setAttribute("name", request.getParameter("name"));
		request.setAttribute("date", new Date().toString());		
	%>
	request : ${date} <br>