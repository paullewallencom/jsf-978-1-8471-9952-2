<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<f:view>
    <h2>JSF and Dojo working for great custom components</h2>
    <h:outputText value="Provided e-mail:" />
    <h:outputText id="getEmailID" value="#{dojoEmailBean.email}"/>
</f:view>