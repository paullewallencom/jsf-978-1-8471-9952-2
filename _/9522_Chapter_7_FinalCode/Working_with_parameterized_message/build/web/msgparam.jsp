<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Working with parametrized messages</title>
        </head>
        <body>       
            <h:outputFormat value="#{msg.USER_ORDERS}">
                <f:param value="#{myBean.orders}" />
                <f:param value="#{myBean.date}" />
            </h:outputFormat>
            <br/>
            <h:outputFormat value="#{msg.USER_ORDERS_CORRECT}">
                <f:param value="#{0}" />
                <f:param value="#{myBean.date}" />
            </h:outputFormat>
            <br/>
            <h:outputFormat value="#{msg.USER_ORDERS_CORRECT}">
                <f:param value="#{1}" />
                <f:param value="#{myBean.date}" />
            </h:outputFormat>
            <br/>
            <h:outputFormat value="#{msg.USER_ORDERS_CORRECT}">
                <f:param value="#{5}" />
                <f:param value="#{myBean.date}" />
            </h:outputFormat>
        </body>
    </html>
</f:view>

