<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://primefaces.prime.com.tr/ui" prefix="p" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <p:resources/>
        </head>
        <body>
            <p:imageCropper value="#{cropBean.cropImage}" image=" images/2009/rafael_nadal1.PNG" />

        </body>
    </html>
</f:view>
