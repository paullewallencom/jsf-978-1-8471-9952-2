<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Use JSF ID Generator for a JSF Component</title>

	</head>
	<body>

	<h:form id="id0">
		<h:outputText id="id1" value="Enter Your Name:" />
		<h:inputText id="id2" value="Somethging from a bean!" />
		<h:commandButton id="id3" action="some_page.jsp" value="OK" />
	</h:form>

	</body>
	</html>
</f:view>