<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="s" uri="http://myfaces.apache.org/sandbox"%>
<%@taglib prefix="t" uri="http://myfaces.apache.org/tomahawk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Export table data to Excel and/or pdf format using Tomahawk Sandbox</title>
        </head>
        <body>
            <h:form>
                <t:dataTable id="my_cars" var="car" value="#{carsBean.carItems}"
                             preserveDataModel="false">
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Car Number" />
                        </f:facet>
                        <h:outputText value="#{car.carNumber}" />
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Car Name" />
                        </f:facet>
                        <h:outputText value="#{car.carName}" />
                    </h:column>
                </t:dataTable>

                <h:commandButton value="Export Excel">
                    <s:exporterActionListener filename="output" fileType="XLS" for="my_cars">
                    </s:exporterActionListener>
                </h:commandButton>
                <h:commandButton value="Export PDF">
                    <s:exporterActionListener filename="output" fileType="PDF" for="my_cars">
                    </s:exporterActionListener>
                </h:commandButton>
            </h:form>
        </body>
    </html>
</f:view>
