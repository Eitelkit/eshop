<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/pages/common/taglibs.jsp"%>
<html>
<head>
	<base href="<%=basePath%>">
	<title>登录</title>
	<!-- begin cssStyle -->
	<link rel="stylesheet" href="<%=basePath %>css/reset.css" />
	<link rel="stylesheet" href="<%=basePath %>css/common.css" />
	<link rel="stylesheet" href="<%=basePath %>css/index.css" />
	<!-- end cssStyle -->
	<link rel="shortcut icon" href="favicon.ico" />
	<script type="text/javascript" src="<%=basePath %>js/jQuery.js"></script>
	<script type="text/javascript" src="<%=basePath %>js/common.js"></script>
	<script type="text/javascript" src="<%=basePath %>js/list.js"></script>
	<script type="text/javascript" src="<%=basePath %>js/register.js"></script>
</head>
<body>
	<div id="header">
		<div>
			<h1><s:text name="com.eshop.header" /></h1>
			<h5>
				<a href="javascript:void(0);">&nbsp;我的购物车</a>
			</h5>
			<h5>|</h5>
			<h5>
				<a href="pages/login.jsp" id="login">登&nbsp;&nbsp;录&nbsp;</a>
			</h5>
		</div>
	</div>
	<div id="nav">
		<div>
			<h1><s:text name="com.eshop.name" /></h1>
			<ul>
				<li>
					<a href="main.jsp">首&nbsp;&nbsp;页</a>
				</li>
				<li>
					<a href="javascript:void(0);">活&nbsp;&nbsp;动</a>
				</li>
				<li>
					<a href="shopping/allProduct.action">全部商品</a>
					<ul id="list">
						<li>
							<a href="javascript:void(0);">美味的食品</a>
						</li>
						<li>
							<a href="javascript:void(0);">好喝的饮品</a>
						</li>
						<li>
							<a href="javascript:void(0);">必备日用品</a>
						</li>
						<li>
							<a href="javascript:void(0);">土豪送的礼品</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:void(0);">关于我们</a>
				</li>
				<li>
				<form action="<%=basePath %>shopping/searchProduct.action" method="post" name="search">
				&nbsp;
				<input type="text" name="keyword" size="20" value="" onfocus="this.value=''"/>
				<span><input type="button"  onclick="document.search.submit();" value="搜索" class="search" id="btn"/></span>
				</form>
				</li>
			</ul>
		</div>
	</div>
	<div id="form">
		<form action="<%=basePath %>pages/commonsys/login.action" method="post">
			<img src="images/login.png" alt="" />
			<div>
				<label for="name">登录名：
					<font size="1" color="red">&nbsp;&nbsp;<s:fielderror fieldName="name"/></font>
					<input type="text" name="name" id="name" value="${name}"/>
				</label>
				<label for="password">登录密码：<a href="javascript:void(0);">密码丢了？</a>
					<font size="1" color="red"><s:fielderror fieldName="password"/></font>
					<input type="password" name="password" id="password"/>
				</label>
				<input type="submit" value="登录"/>
				<a href="pages/register.jsp">免费注册</a>
				<a href="javascript:void(0);" id="return">返回首页</a>
			</div>
		</form>
	</div>
	<%  
String path1=application.getRealPath(request.getRequestURI());  
String realPath1 = "http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath()+request.getServletPath().substring(0,request.getServletPath().lastIndexOf("/")+1);   
out.println("web URL 路径:"+realPath1); 
String url = request.getScheme()+"://"+ request.getServerName()+request.getRequestURI();
out.println("web URL 路径:"+url); 
%> 
	
</body>
</html>