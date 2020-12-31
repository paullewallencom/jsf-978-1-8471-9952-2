<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="e" uri="http://packt.net/cookbook/components"%>
<%@taglib prefix="jsfxt" uri="http://java.sun.com/jsf/extensions/dynafaces"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSF custom component, AJAX enabled</title>
            <jsfxt:scripts />
        </head>
        <body>
            <h3><h:outputText value="This images are provided by a JSF custom component AJAX enabled:"/></h3>            
            <h:form>              
               <e:imgOutput path="/img/rafa_1.jpg,/img/rafa_2.jpg,/img/rafa_3.jpg,/img/rafa_4.jpg,/img/rafa_5.jpg" width="340" height="466" />
            </h:form>
        </body>
    </html>
</f:view>
