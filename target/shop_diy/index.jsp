<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>网站入口</title>


</head>

<body>
<%--必须经过action--------创建访问首页的action（拦截器才能访问到WEB-INF下的jsp文件
【不安全的方式是配置servlet，将WEB-INF下的文件配置为可直接访问的静态资源文件】）--%>
<jsp:forward page="index"></jsp:forward>
</body>
</html>
