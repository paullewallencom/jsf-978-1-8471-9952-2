<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://myfaces.apache.org/commons/validators" prefix="mcv"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>            
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Apache MyFaces Commons Validators</title>
        </head>
        <body>
            <h:form>
                <h:panelGrid columns="3">
                    <h:outputLabel for="name" value="Name:  "/>
                    <h:inputText id="name" value="#{user.name}" required="true"/>
                    <h:message for="name"/>
                    <h:outputLabel for="email1" value="Email:  "/>
                    <h:inputText id="email1" value="#{user.email}" required="true">
                        <mcv:validateEmail/>
                    </h:inputText>
                    <h:message for="email1"/>
                </h:panelGrid>
                <h:commandButton value="Submit"/>
            </h:form>
        </body>
    </html>
</f:view>
