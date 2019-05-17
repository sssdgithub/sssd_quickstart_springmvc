<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
    <%--quickstart--%>
    <a href="quickstart/sayHello">quickstart</a>
    <br>
    <%--普通字符串请求参数绑定--%>
    <a href="quickstart/param?username=username&password=password">普通字符串请求参数绑定</a>
    <%--对象请求参数绑定--%>
    <%--<form method="post" action="quickstart/beanParam">--%>
        <%--username:<input type="text" name="username">--%>
        <%--<br>--%>
        <%--password:<input type="text" name="password">--%>
        <%--<br>--%>
        <%--orderName:<input type="text" name="order.name">--%>
        <%--<br>--%>
        <%--orderPrice:<input type="text" name="order.price">--%>
        <%--<br>--%>
        <%--<input type="submit" value="提交">--%>
        <%--<br>--%>
    <%--</form>--%>
    <%--<br>--%>
    <%--集合参数绑定--%>
    <%--<form method="post" action="quickstart/collectionParam">--%>
        <%--username:<input type="text" name="username">--%>
        <%--<br>--%>
        <%--password:<input type="text" name="password">--%>
        <%--<br>--%>
        <%--orderName:<input type="text" name="order.name">--%>
        <%--<br>--%>
        <%--orderPrice:<input type="text" name="order.price">--%>
        <%--<br>--%>

        <%--orderName:<input type="text" name="list[0].name">--%>
        <%--<br>--%>
        <%--orderPrice:<input type="text" name="list[0].price">--%>
        <%--<br>--%>

        <%--orderName:<input type="text" name="map['orderOne'].name">--%>
        <%--<br>--%>
        <%--orderPrice:<input type="text" name="map['orderOne'].price">--%>
        <%--<br>--%>
        <%--<input type="submit" value="提交">--%>
        <%--<br>--%>
    <%--</form>--%>
    <%--<br>--%>

    <%--自定义类型转换器--%>
    <%--<form action="quickstart/converter" method="post">--%>
        <%--birthday:<input type="text" name="date">--%>
        <%--<input type="submit" value="提交">--%>
    <%--</form>--%>
    <br>

    <a href="anno/annoParam?username=username">annoQuickstart</a>

    <%--<form method="post" action="anno/annoRequestBody">--%>
        <%--username:<input type="text" name="username">--%>
        <%--<input type="submit" value="提交">--%>
    <%--</form>--%>
<br>
    <form method="post" action="anno/annoPathVariable">
        username:<input type="text" name="username">
        password:<input type="text" name="password">
        <input type="submit" value="提交">
    </form>
<br>
    <a href="anno/annoPathVariable/33">annoPathVariableTest</a>
<br>
    <a href="anno/annoRequestHeader">annoRequestHeaderTest</a>
</body>
</html>
