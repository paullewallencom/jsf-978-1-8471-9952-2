<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="p" uri="http://primefaces.prime.com.tr/ui"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <p:resources />
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>PrimeFaces CommandLink</title>
        </head>
        <body>
            <h:form prependId="false">
                <p:panel id="panel" style="width: 550px; margin-bottom:10px;" header="Provide your ID to check ...">
                    <p:messages showDetail="false" globalOnly="false" />
                    <h:panelGrid border="0" columns="5">
                        <h:outputLabel for="nickId" value="ID: *" />
                        <h:inputText id="nickId" value="#{bean.nick}" required="true" />

                        <p:commandLink  actionListener="#{bean.nickAction}" update="panel" style="margin-right:20px;">
                            <h:outputText value="Check ID availability" />
                        </p:commandLink>

                        <p:commandButton async="true" value="Check ID availability" update="panel" actionListener="#{bean.nickAction}" style="margin-right:20px;"/>

                        <p:ajaxStatus style="height:16px">
                            <f:facet name="start">
                                <h:graphicImage value="resources/images/ajaxloading.gif" />
                            </f:facet>
                            <f:facet name="complete">
                                <h:outputText value="" />
                            </f:facet>
                        </p:ajaxStatus>
                    </h:panelGrid>
                </p:panel>
            </h:form>
        </body>
    </html>
</f:view>
