<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://www.hexiao.cn/rss4jsf" prefix="rss4jsf" %>

<f:view>
    <rss4jsf:simpleRssOutput url="http://services.devx.com/outgoing/devxfeed.xml" count="500">
         <f:facet name="item">           
            <div class="item">                
                <h:outputLink value="#{item.url}">                    
                    <b><h:outputText value="#{item.title}"/></b>
                    <f:verbatim> - </f:verbatim>
                    <h:outputText value="#{item.author}"/><br />
                    <i><h:outputText value="#{item.body}"/></i><br /><br />
                </h:outputLink>            
            </div>          
        </f:facet>
    </rss4jsf:simpleRssOutput>

</f:view>