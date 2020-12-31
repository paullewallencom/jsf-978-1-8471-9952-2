<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="t" uri="http://myfaces.apache.org/tomahawk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <h:form id="uploadForm" enctype="multipart/form-data">
                <h:panelGrid columns="3">
                    <h:outputLabel for="fileID" value="Choose a file to upload:" />
                    <t:inputFileUpload id="fileID" value="#{uploadBean.uploadedFile}" storage="file" required="true" />
                    <h:message showSummary="true" showDetail="false" for="fileID"
                               style="color: red; text-decoration:overline"/>
                    <h:panelGroup />
                    <h:commandButton value="Submit" action="#{uploadBean.submit}" />
                    <h:message for="uploadForm" infoStyle="color: blue;" errorStyle="color: red;" />
                </h:panelGrid>
            </h:form>
        </body>
    </html>
</f:view>
