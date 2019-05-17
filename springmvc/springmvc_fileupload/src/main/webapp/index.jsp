<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<%--文件上传--%>
<%--<form action="upload/oldUpload" method="post" enctype="multipart/form-data">--%>
    <%--请选择文件:<input type="file" name="myFile">--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>
<%--springmvc文件上传--%>
<%--<form action="upload/newUpload" method="post" enctype="multipart/form-data">--%>
    <%--请选择文件:<input type="file" name="file">--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>
<h3>跨服务器上传文件</h3>
<form action="upload/serverUpload" method="post" enctype="multipart/form-data">
    请选择文件:<input type="file" name="file">
    <input type="submit" value="提交">
</form>
</body>
</html>
