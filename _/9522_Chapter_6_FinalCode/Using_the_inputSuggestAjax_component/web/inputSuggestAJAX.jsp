<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://myfaces.apache.org/sandbox" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Use the s:inputSuggestAjax tag</title>
    </head>
    <body>
        <f:view>
            <h:form prependId="false">
                <br />
                <h:outputText value="Enter Name:"/><br/>
                <s:inputSuggestAjax suggestedItemsMethod="#{namesBean.getSuggestedNames}" value="#{namesBean.name}"/>
            </h:form>
        </f:view>
    </body>
</html>

