<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <h:form id="loginForm" prependId="false">
        <h:panelGrid columns="4" footerClass="subtitle"
                     headerClass="subtitlebig" styleClass="medium"
                     columnClasses="subtitle,medium">
            <f:facet name="header">
                <h:outputText value="Login page:"/>
            </f:facet>
            <label for="j_username">
                <h:outputText value="User:" />
            </label>
            <h:inputText id="j_username" required="true" />

            <label for="j_password">
                <h:outputText value="Password:" />
            </label>
            <h:inputSecret id="j_password" required="true" />

            <label for="_spring_security_remember_me">
                <h:outputText value="Remember me" />
            </label>
            <h:selectBooleanCheckbox id="_spring_security_remember_me" />
            <h:outputText value=" "  />

            <h:commandButton type="submit" id="login" action="#{springLoginBean.loginAction}" value="Login" />
        </h:panelGrid>
    </h:form>

    <h:messages />
</f:view>
