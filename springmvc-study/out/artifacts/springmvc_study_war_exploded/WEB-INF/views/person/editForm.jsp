<%--
  Created by IntelliJ IDEA.
  User: Nick
  Date: 2018/5/29
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<head>
    <title>编辑人员表单</title>
</head>
<body>

<sf:form enctype="multipart/form-data"
         action="${pageContext.request.contextPath}/person/editperson"
         modelAttribute="p"
         method="post">

    <sf:hidden path="id"/>

    <div style="padding:20px;">
        编辑人员信息
    </div>

    <div style="padding:10px;">
        错误信息：
        <br />
        <fond color="red">${errMsg}</fond>
    </div>

    <table>
        <tr>
            <td>姓名:</td>
            <td><sf:input path="name"/></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><sf:input path="age"/></td>
        </tr>
        <tr>
            <td>图片:</td>
            <td><input type="file" name="photo" value=""/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" name="btnOK" value="保存"/></td>
        </tr>
    </table>
</sf:form>

</body>
</html>
