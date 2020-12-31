<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Using Acegi/Spring security in JSF applications</title>
        </head>
        <body>
            <h3>Using Acegi/Spring security in JSF applications</h3><br />
            <h4>
                <h:outputLink value="faces/login.jsp">
                    <f:verbatim>Login page</f:verbatim>                    
                </h:outputLink>
                - Click this link to login. This will give you access to the secured page.
            </h4>
            <h4>
                <h:outputLink value="faces/logout.jsp">
                    <f:verbatim>Logout page</f:verbatim>                    
                </h:outputLink>
                - Click this link to logout. This will stop access to the secured page.
            </h4>
            <h4>
                <h:outputLink value="faces/secured.jsp">
                    <f:verbatim>Secured page</f:verbatim>                    
                </h:outputLink>
                - Click this link to access the secured page. If you are not login then you will be redirected to the login page.
            </h4>
        </body>
    </html>
</f:view>
