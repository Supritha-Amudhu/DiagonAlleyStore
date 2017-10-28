<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="TemplateHeader.css"></link>
<script type="text/javascript" src="imageslider.js"></script>
<title>Insert title here</title>
</head>
<body>
<c:catch>

<c:set var="shoppername" value="${requestScope.shoppername}"></c:set>
<c:out value="${shoppername}"></c:out>

</c:catch>
</body>
</html>