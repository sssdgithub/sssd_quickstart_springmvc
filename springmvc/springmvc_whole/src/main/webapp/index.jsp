<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<hr>
<%--参数测试<br>--%>
<%--<a href="user/param?username=username&password=password&birthday=2019/05/16">paramTest</a>--%>
<%--<br>--%>
<%--<form method="post" action="user/param">--%>
    <%--username:<input type="text" name="username">--%>
    <%--password:<input type="text" name="password">--%>
    <%--birthday:<input type="text" name="birthday">--%>
    <%--orderName:<input type="text" name="order.name">--%>
    <%--orderPrice:<input type="text" name="order.price">--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>
<br>
<%--<form method="post" action="user/param">--%>
    <%--username:<input type="text" name="username">--%>
    <%--password:<input type="text" name="password">--%>
    <%--birthday:<input type="text" name="birthday">--%>
    <%--orderName:<input type="text" name="orders[0].name">--%>
    <%--orderPrice:<input type="text" name="orders[0].price">--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>
<br>
<br>
<%--<form method="post" action="user/param">--%>
    <%--username:<input type="text" name="username">--%>
    <%--password:<input type="text" name="password">--%>
    <%--birthday:<input type="text" name="birthday">--%>
    <%--orderName:<input type="text" name="orders['one'].name">--%>
    <%--orderPrice:<input type="text" name="orders['one'].price">--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>
<br>
<%--<br>--%>
<%--<form method="post" action="user/param">--%>
    <%--username:<input type="text" name="user.username">--%>
    <%--password:<input type="text" name="user.password">--%>
    <%--birthday:<input type="text" name="user.birthday">--%>
    <%--orderName:<input type="text" name="order.name">--%>
    <%--orderPrice:<input type="text" name="order.price">--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>
<%--<br>--%>
<%--//-------------------------------------------------------%>
<%--//以上均为参数绑定测试--%>
<%--返回测试<br>--%>
<%--<a href="user/response">forwardOrRedirectOrResponseTest</a>--%>
<%--<a href="user/responseJson">responseJsonTest</a>--%>
<%--自定义异常测试<br>--%>
<%--<a href="user/exceptoionO">exceptoionOTest</a>--%>
<%--自定义拦截器测试<br>--%>
<%--<a href="user/interceptor">interceptorTest</a>--%>
上传文件测试<br>
<form action="user/upload" method="post" enctype="multipart/form-data">
    请选择文件:<input type="file" name="file">
    <input type="submit" value="上传文件">
</form>
<a></a>
</body>
</html>
