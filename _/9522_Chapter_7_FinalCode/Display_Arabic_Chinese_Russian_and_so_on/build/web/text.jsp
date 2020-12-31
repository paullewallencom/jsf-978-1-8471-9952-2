<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Display Arabic, Chinese, Russian and so on</title>
        </head>
        <body>
            <h1><h:outputText value="Insert any text:"/></h1>
            <h:form id="myForm">
           <h:inputText id="myID" required="true" value="#{myBean.text}"/>
           <br />
           <h:commandButton id="submit" action="response?faces-redirect=true" value="Submit"/>
        </h:form>
        </body>
    </html>
</f:view>
