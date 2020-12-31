<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <f:view>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>a4j:support</title>
        </head>
        <body>

        </body>
        <h:form id="myForm">
            <h:outputText value="Text:" />
            <h:inputText value="#{textBean.text}">
                <a4j:support event="onkeyup" reRender="textId" action="#{textBean.upperText}"/>
            </h:inputText>
            <h:outputText value="Upper Text:" />
            <h:outputText id="textId" value="#{textBean.text}" />
        </h:form>

    </body>
</f:view>
</html>

