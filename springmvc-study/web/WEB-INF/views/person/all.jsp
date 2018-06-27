<%--
  Created by IntelliJ IDEA.
  User: Nick
  Date: 2018/5/28
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>人员列表</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/personform.action" method="post">

    <div style="padding:20px;">
        人员列表
    </div>

    <div style="padding-left:40px;">
        <!-- 跳转路径 -->
        <a href="/springmvc-study/person/newform">新增</a>
    </div>

    <table border="1">
        <tr>
            <td>编号</td>
            <td>头像</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${personList}" var="p">
            <tr>
                <td>${p.id}</td>
                <td><img src="${pageContext.request.contextPath}${p.headImgPath}" width="70px" height="45px" /></td>
                <td>${p.name}</td>
                <td>${p.age}</td>
                <td>
                    <a href=/springmvc-study/person/editform?id=${p.id}>编辑</a>
                    &nbsp;
                    <a href=/springmvc-study/person/delperson?id=${p.id}>删除</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</form>
</body>
</html>
