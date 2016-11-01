<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/common.jsp" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form id="loginForm" name="loginForm" action="/login" method="post">
        帐号：<input id="account" name="account" type="text">
        密码：<input id="password" name="password" type="password">
        <input id="submit" name="submit" type="submit" value="提交"/>
    </form>
</body>
</html>
