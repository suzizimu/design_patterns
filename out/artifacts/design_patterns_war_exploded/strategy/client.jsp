<%--`
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/28
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户端选择</title>
</head>
<body>
<form action="/design_patterns/strategy2.do" method="post">
    金额：
    <input name="money"><br><br>

    类型：
    <select name="type">
        <option value="正常收费">正常收费</option>
        <option value="满300返100">满300返100</option>
        <option value="打8折">打8折</option>
    </select>
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
