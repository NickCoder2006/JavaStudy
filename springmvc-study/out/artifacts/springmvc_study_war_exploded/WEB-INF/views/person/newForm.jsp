<%--
  Created by IntelliJ IDEA.
  User: Nick
  Date: 2018/5/29
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>新增人员表单</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/person/addperson" method="post">

    <div style="padding:20px;">
        新增人员
    </div>

    <table>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name" value=""/></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input type="text" name="age" value=""/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" name="btnOK" value="保存"/></td>
        </tr>
    </table>
</form>

</body>
</html>
