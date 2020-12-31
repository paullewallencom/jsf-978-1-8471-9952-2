<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSF-SECURITY</title>
        </head>
        <body>
            <h:form>
                <h:panelGroup rendered="#{!securityScope.securityEnabled}">
                    <h:outputText value="Security is not enabled..."/>
                </h:panelGroup>
                <h:panelGrid columns="2" rendered="#{securityScope.securityEnabled}">
                    <h:outputText value="Remote User"/>
                    <h:outputText value="#{securityScope.remoteUser}"/>
                    <h:outputText value="Auth Type"/>
                    <h:outputText value="#{securityScope.authType}"/>
                    <h:outputText value="User in JSP-ROLE "/>
                    <h:outputText value="#{securityScope.userInRole['JSP-ROLE']}"/>
                    <h:outputText value="User in all of JSP-ROLE "/>
                    <h:outputText value="#{securityScope.userInAllRoles['JSP-ROLE']}"/>
                </h:panelGrid>
            </h:form>
        </body>
    </html>
</f:view>
