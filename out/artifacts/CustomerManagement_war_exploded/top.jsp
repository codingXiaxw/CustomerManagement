<%--
  Created by IntelliJ IDEA.
  User: codingBoy
  Date: 16/10/23
  Time: 下午12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- 他的作用是为本页面所有的表单和超链接指定显示内容的框架-->
    <base target="main">
    <title>My JSP 'top.jsp' starting page</title>
</head>
<body style="text-align: center;">
    <h1>客户关系管理系统</h1>
    <a href="<c:url value='/add.jsp'/>">添加客户</a>
    <a href="<c:url value='/CustomerServlet?method=findAll'/>">查询客户</a>
    <a href="<c:url value='/query.jsp'/>">高级搜索</a>

</body>
</html>
