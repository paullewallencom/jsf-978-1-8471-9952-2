<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Upload files with RichFaces</title>
        </head>
        <body>
            <h:form>
                <h:panelGrid columns="1">
                    <rich:fileUpload  fileUploadListener="#{fileUploadBean.listener}"
                                      maxFilesQuantity="5"
                                      immediateUpload="false"
                                      acceptedTypes="png, bmp, jpg"
                                      allowFlash="false">                      
                    </rich:fileUpload>
                </h:panelGrid>
            </h:form>
        </body>
    </html>
</f:view>
