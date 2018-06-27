<%--
  Created by IntelliJ IDEA.
  User: Nick
  Date: 2018/5/28
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<h2>主页</h2>
<h4>SpringMVC学习工程。</h4>
<br />
<a href="${pageContext.request.contextPath}/person/all">显示人员列表</a>
<br />
<br />
<img src="${pageContext.request.contextPath}/upload/car.jpg" width="700px" height="450px">
</body>
</html>
