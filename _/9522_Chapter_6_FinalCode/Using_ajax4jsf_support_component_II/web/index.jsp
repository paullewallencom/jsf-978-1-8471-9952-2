<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@taglib prefix="rich" uri="http://richfaces.org/rich"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>a4j:support</title>
        </head>
        <body>

        </body>

        <h:form id="myForm">
            <h:selectOneRadio id="companyId" value="#{carsBean.carCompany}" valueChangeListener="#{carsBean.companyChanged}">
                <f:selectItems value="#{carsBean.allCars}"/>
                <a4j:support event="onchange" reRender="carsId" />
            </h:selectOneRadio>

            <h:outputText value="Available cars for company #{carsBean.carCompany}:" />
            <h:dataTable id="carsId" value="#{carsBean.companyCars}" var="car">
                <h:column>
                    <h:outputText value="#{car}" />
                </h:column>
            </h:dataTable>
        </h:form>

    </body>
</html>
</f:view>
