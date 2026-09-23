<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
application : <%= application.getAttribute("info") %> <br>
session : <%= session.getAttribute("name")%><br>
request : <%= request.getAttribute("date") %>		
<h1> JSP -> EL이 표준 문법, JSTL </h1>
application : ${info} <br>
session : ${name} <br>
request : ${date}