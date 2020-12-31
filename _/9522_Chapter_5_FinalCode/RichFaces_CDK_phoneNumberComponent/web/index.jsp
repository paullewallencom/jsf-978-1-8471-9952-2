<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<!-- RichFaces tag library declaration -->
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<!-- Custom component tag library declaration -->
<%@ taglib uri="http://packt.cdk.org/phoneNumberComponent" prefix="e"%>

<html>
    <head>
        <title>Using the phoneNumberComponent custom component</title>
    </head>
    <body>
        <f:view>
            <h:form id="phoneFormID">
                <e:phoneNumberComponent id="phoneID"
                                        title="Enter phone number as xxxx-xxxxx-x"
                                        value="#{bean.phone}" />
                <h:message showSummary="true" showDetail="false" for="phoneID"
                           style="color: red; text-decoration:overline" />
                <br />
                <h:commandButton id="btnID" value="Submit Phone" />
            </h:form>
        </f:view>
    </body>
</html>

