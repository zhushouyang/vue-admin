<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>" />
<title><tiles:insertAttribute name="title" /></title>

<span style="font-family: Arial, Helvetica, sans-serif;"> <!-- 主布局页面 -->
</span>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 引入自定义的样式等内容 -->
<tiles:insertAttribute name="heads" />
</head>

<body class="nav-md">

	<div class="container body">
		<div class="main_container">
			<!-- 功能菜单界面 -->
			<jsp:include page="nav.jsp"></jsp:include>
			<!-- /功能菜单界面 -->

			<!-- 当前页面内容 -->
			<div class="right_col" role="main">
				<tiles:insertAttribute name="body" />
			</div>
			<!-- /当前页面内容 -->
		</div>
	</div>


	<tiles:insertAttribute name="scripts" />
</body>
</html>