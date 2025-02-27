<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>            
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Validate forms with RichFaces rich:ajaxValidator</title>
        </head>
        <body>
            <h:form id="form">
                <h:panelGrid columns="3">
                    <h:outputLabel for="email" value="Email Address:" />
                    <h:inputText id="email" value="#{bean.email}" label="Email">
                        <rich:ajaxValidator event="onkeyup" summary="Invalid Email address"/>
                    </h:inputText>
                    <rich:message for="email"/>
                    <h:outputLabel for="age" value="Age:" />
                    <h:inputText id="age" value="#{bean.age}" label="Age">
                        <rich:ajaxValidator event="onkeyup" summary="Invalid age, must be between 18 and 90"/>
                    </h:inputText>
                    <rich:message for="age"/>
                </h:panelGrid>
                <h:commandButton value="Submit"></h:commandButton>
                <rich:messages/>
            </h:form>
        </body>
    </html>
</f:view>
