<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="j4j" uri="http://javascript4jsf.dev.java.net/"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Use Proxy Id for a JSF Component</title>

            <script type="text/javascript" language="javascript">
                function JSBook(){
                    var js_book_title=document.getElementById("get_book_id").title;
                    var js_book_value = document.getElementById(js_book_title).value;

                    alert("JS Book [Title]: " + js_book_title);
                    alert("JS Book [Value]: " + js_book_value);
                }
            </script>
        </head>
        <body>
            <h:form id="bookForm">
                <h:inputText id="bookID" value="JSF Cookbook">
                    <j4j:idProxy id="get_book_id" />
                </h:inputText>
                <h:commandButton id="submit" value="See book title and value!" onclick="JSBook();"/>
            </h:form>
        </body>
    </html>
</f:view>
