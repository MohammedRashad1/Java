<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="str" value="Hello... How are You"></c:set>
	Length: ${fn:length(str)}
	<c:forEach items="${fn:split(str,' ') }" var ="s">
	<br>
	${s}
	</c:forEach>
	
	Index: ${fn:indexOf(str,"are")}<br> 
	is there: ${fn:contains(str, "how") } <br>
	${fn:toUpperCase(str)} <br>
	${fn:toLowerCase(str)}

</body>
</html>