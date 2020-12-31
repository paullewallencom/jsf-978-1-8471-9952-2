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
            <title>RichFaces standard and custom converters</title>
        </head>
        <body>

        </body>
        <a4j:form>
            <h:outputText value="The integer version of the selected color:"/>
            <h:outputText id="RGBvalue" value="#{colorPickerBean.color}"/>
            <rich:panel header="RichFaces Color Picker" style="width: 315px">
                <!--
                <rich:colorPicker value="#{colorPickerBean.color}" colorMode="rgb" converter="org.richfaces.IntegerColor">
                    <a4j:support event="onchange" reRender="RGBvalue"/>
                </rich:colorPicker>
                -->
                <rich:colorPicker value="#{colorPickerBean.color}" colorMode="rgb" converter="rgbConverter">
                    <a4j:support event="onchange" reRender="RGBvalue"/>
                </rich:colorPicker>                
            </rich:panel>
        </a4j:form>

    </body>
</html>
</f:view>
