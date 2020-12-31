<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://myfaces.apache.org/trinidad" prefix="tr"%>
<%@taglib uri="http://myfaces.apache.org/trinidad/html" prefix="trh"%>
<%@taglib uri="http://myfaces.apache.org/trinidadip" prefix="trip"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>           
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Client-side converters with Apache Trinidad</title>
        </head>
        <body>
            <tr:document>
                <tr:form>
                    <tr:panelPage>
                        <tr:panelHeader text="IP Converter" />
                        <tr:panelFormLayout>
                            <tr:inputText value="#{ipBean.ip}"
                                          label="Insert a number of type 000000000000 or 000.000.000.000:">
                                <trip:convertIP/>
                            </tr:inputText>
                        </tr:panelFormLayout>
                        <tr:panelButtonBar>
                            <tr:commandButton  text="Submit" />
                        </tr:panelButtonBar>
                    </tr:panelPage>
                </tr:form>
            </tr:document>
        </body>
    </html>
</f:view>
