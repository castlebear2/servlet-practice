<%@page import="com.douzone.guestbook.dao.GuestBookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");


	String no = request.getParameter("no");
	String password = request.getParameter("password");
	
	new GuestBookDao().deleteByPassword(no, password);
	
	response.sendRedirect(request.getContextPath());
%>