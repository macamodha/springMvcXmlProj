<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" >
<link href="../springMvcXmlProj/webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" >
<title>Insert title here</title>
</head>
<body>
	<h1> Hello From Spring Framework</h1>
	<h2> ${message} </h2>
	<hr/>
	<h2>Welcome : ${nameData}</h2>
</body>
</html>

<%-- <%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:genericpage>
    <jsp:attribute name="header">
      <h1>Welcome</h1>
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright">Copyright 1927, Future Bits When There Be Bits Inc.</p>
    </jsp:attribute>
    <jsp:body>
        <h1> Hello From Spring Framework</h1>
		<h2> ${message} </h2>
		<hr/>
		<h2>Welcome : ${nameData}</h2>
    </jsp:body>
</t:genericpage> --%>
