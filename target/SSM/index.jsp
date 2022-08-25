<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/22 0022
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%--默认高版本的servlet禁用el表达式,设置开启即可--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--路径问题:为了解决文件访问的路径(web应用的名称不固定)--%>
<%--解决办法有:--%>
<%--1  在应用的入口处获取应用的名称然后设置到session里--%>
<%--2  使用jsp(jstl)内置的功能解决路径问题--%>
<%--3  控制器内,如果是视图的转发(forward),大多采用相对路径的写法--%>
<%--4  控制器内,如果是重定向(redirect),大多采用绝对路径的写法[例外:UserController中重定向到当前控制器的方法也可以使用相对路径]--%>
<%--开发过程中经常会使用到jstl标签库,所以可以考虑做一个模板页面,创建jsp页面时把通用的设计都自动创建出来--%>
<%--如果在页面的各个部分都能访问到应用的名称,可以在整个应用程序的入口获取应用名称--%>
<%--,放入到session对象中,所有页面只需要访问session对象即可获得应用名--%>
<%
    String appPath = request.getContextPath();//通过该方法拿到的应用路径是以 / 开头的绝对路径  /hitssm
    request.getSession().setAttribute("appContext",appPath);
%>
<%--每次点击太麻烦了--%>
<jsp:forward page="/user/login"></jsp:forward>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--hello  SSM--%>
<%-- <a href="user/a_page">wel</a>--%>

<%--<a href="user/getUsers">获取所有用户信息</a>--%>

<form action="" method="post">
    <input type="hidden" name="_method" value="DELETE" />
    <input name="id" type="text" />
</form>

<a href="${appContext}/employ/opt/3">删除当前数据</a>

<a href="${appContext}/user/login">登录后台</a>


<a href="${appContext}/admin/toAdmin">进入管理后台</a>

<a href="${appContext}/admin/testParam?username=zs&password=222332">关于传递参数的测试1</a>
<a href="${appContext}/admin/testObject?username=zs&password=222332">关于传递对象的测试1</a>
</body>
</html>
