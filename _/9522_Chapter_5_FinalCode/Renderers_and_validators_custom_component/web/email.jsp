<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="e" uri="http://packt.net/cookbook/components"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Writing a JSF custom component - an email component</title>
        </head>
        <body>
            <h:form id="emailForm">
            <h:outputText value="Insert your e-mail:"/><br />
            <e:emailInput value="#{myEmailBean.email}" id="emailID" />
            <h:message showSummary="true" showDetail="false" for="emailID"
                       style="color: red; text-decoration:overline"/>
            <h:commandButton id="submit" action="response?faces-redirect=true" value="Submit"/>
        </h:form>
        </body>
    </html>
</f:view>
