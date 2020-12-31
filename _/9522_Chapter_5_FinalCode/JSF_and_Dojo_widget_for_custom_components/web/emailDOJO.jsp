<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://packt.net/cookbook/components" prefix="e" %>

<style type="text/css">
    @import url("${pageContext.request.contextPath}/script/dojo_lib/dijit/themes/nihilo/nihilo.css");
    @import url("${pageContext.request.contextPath}/script/dojo_lib/dojo/resources/dojo.css");
</style>
<script type="text/javascript" src="${pageContext.request.contextPath}/script/dojo_lib/dojo/dojo.js" djConfig="parseOnLoad: true, isDebug:false"></script>

<script type="text/javascript">
    dojo.require("dojo.parser");
    dojo.require("dijit.form.ValidationTextBox");
    dojo.require("dijit.form.Textarea");
</script>

<body class="nihilo">
    <f:view>
        <h2>JSF and Dojo working for great custom components</h2>

        <h:form id="emailFormID">
            <h:outputText value="Provide your e-mail:" />
            <e:input id="emailID" type="text" promptMessage="Provide your e-mail!" invalidMessage="Invalid e-mail!" dojoType="dijit.form.ValidationTextBox" dojoRequired="true" regExp="[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}" value="#{dojoEmailBean.email}"/>
            <h:commandButton id="emailBtnID" action="response.jsp" value="Submit" type="submit"></h:commandButton>
        </h:form>
    </f:view>
</body>