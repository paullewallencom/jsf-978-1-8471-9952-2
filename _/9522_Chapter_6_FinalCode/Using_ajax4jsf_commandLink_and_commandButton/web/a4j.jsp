<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Demo of a4j:commandLink and a4j:commandButton</title>
    </head>
    <body>
        <f:view>
            <h:outputText value="Set page number manually:"/>
            <h:panelGrid id="panel1ID" columns="2" border="0" style="width:600px;">
                <h:outputText value="a4j:commandLink Example" />
                <a4j:form>
                    <h:outputText value="Set page number: " />
                    <h:inputText value="#{book.pagenr}" />
                    <a4j:commandLink value="Get Page Number" reRender="pagesID" />
                    <h:panelGroup id="pagesID">
                        <h:outputText value="Pages: " rendered="#{not empty book.pagenr}" />
                        <h:outputText value="#{book.pagenr}" />
                        <h:outputText value="!" rendered="#{not empty book.pagenr}" />
                    </h:panelGroup>
                </a4j:form>
            </h:panelGrid>

            <br />
            <h:outputText value="Increase/decrease page number using buttons (the start page is the one setted manually):"/>
            <h:panelGrid id="panel2ID" columns="3" border="0" style="width:600px;">
                <h:outputText value="a4j:commandButton Example" />
                <a4j:form>                    
                    <a4j:commandButton action="#{book.pageItForward}"
                                       value="Page It Forward" reRender="pifID" />
                    <a4j:commandButton action="#{book.pageItBackwards}"
                                       value="Page It Backwards" reRender="pifID" />
                </a4j:form>
                <h:outputText value="Page number:#{book.pagenr}" id="pifID" />
            </h:panelGrid>

        </f:view>
    </body>
</html>

