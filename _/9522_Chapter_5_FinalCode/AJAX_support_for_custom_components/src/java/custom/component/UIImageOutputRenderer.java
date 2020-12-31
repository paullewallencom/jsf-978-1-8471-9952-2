package custom.component;

import java.io.IOException;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;
import javax.servlet.ServletContext;

public class UIImageOutputRenderer extends Renderer{
   
    private UIForm getUIForm(UIComponent ui_comp) {

        UIComponent uiParent = ui_comp.getParent();

         if (uiParent == null) {
            throw new IllegalStateException("Form unavailable!");
        }

        while (uiParent != null) {
            if (uiParent instanceof UIForm) {
                break;
            }
            uiParent = uiParent.getParent();
        }
       
        return (UIForm) uiParent;
    }
       
    private String previousLink(FacesContext ctx, UIComponent ui_comp){
        String clientId = getUIForm(ui_comp).getId();
        String uiClientId = ui_comp.getId();
        String result = clientId + "_" + uiClientId + "_P";
        return result;
    }

    private String nextLink(FacesContext ctx, UIComponent ui_comp){
        String clientId = getUIForm(ui_comp).getId();
        String uiClientId = ui_comp.getId();
        String result = clientId + "_" + uiClientId + "_N";
        return result;
    }

    private String hiddenField(FacesContext ctx, UIComponent ui_comp) {
        String clientId = getUIForm(ui_comp).getId();
        String uiClientId = ui_comp.getId();
        String result = clientId + "_" + uiClientId + "_H";
        return result;
    }

    @Override
    public void encodeBegin(FacesContext ctx, UIComponent ui_comp) throws IOException {

        UIImageOutput uiImageOutput = (UIImageOutput)ui_comp;

        ResponseWriter responseWriter = ctx.getResponseWriter();
        responseWriter.startElement("table", uiImageOutput);

        // get "id" attribute
        String id = (String)uiImageOutput.getClientId(ctx);
        responseWriter.writeAttribute("id", id, null);

        //Java Script postback code
        UIForm uiForm = getUIForm(uiImageOutput);
        String clientId = uiForm.getClientId(ctx);
        String postBack = uiImageOutput.getId() + "_PB";
        String formName = uiForm.getId() + uiImageOutput.getId() + "_F";

        responseWriter.startElement("script", uiImageOutput);
        responseWriter.writeAttribute("type", "text/javascript", null);

        //without AJAX
        //String script = "\nvar " + formName + " = document.forms['" + clientId + "'];" + "\nfunction" + " " + postBack + "(element) {\n" +
        //        " if (" + formName + ".onsubmit == null || " + formName + ".onsubmit()) {\n" + " " + formName + "." + hiddenField(ctx, uiImageOutput) +
        //        ".value = element.id; \n" + " " + formName + ".submit();" + "\n } \n} \n";

        //with AJAX
        String script = "\nvar " + formName + " = document.forms['" + clientId + "'];" + "\nfunction" + " " + postBack + "(element) {\n" +
                " if (" + formName + ".onsubmit == null || " + formName + ".onsubmit()) {\n" + " document.getElementById('" + hiddenField(ctx, uiImageOutput) +
                "').value = element.id; \n" + " DynaFaces.fireAjaxTransaction(element,{execute:'" + id + "',render:'" + id + "',inputs:'" +
                hiddenField(ctx, uiImageOutput) + "'});" + "\n}\n}\n";
        
        responseWriter.writeText(script, ui_comp, null);
        responseWriter.endElement("script");

        responseWriter.startElement("input", uiImageOutput);
        responseWriter.writeAttribute("type", "hidden", null);

        //without AJAX
        //responseWriter.writeAttribute("name", hiddenField(ctx, uiImageOutput), null);
        
        //with AJAX
        responseWriter.writeAttribute("id", hiddenField(ctx, uiImageOutput), null);
        
        responseWriter.writeAttribute("value", "", null);
        responseWriter.endElement("input");

        // "tr" element
        responseWriter.startElement("tr", uiImageOutput);
        // "td" element (image)
        responseWriter.startElement("td", uiImageOutput);

         // Render the image
        ServletContext servletContext = (ServletContext)ctx.getExternalContext().getContext();
        String contextPath = servletContext.getContextPath();
        responseWriter.startElement("img", uiImageOutput);
        responseWriter.writeAttribute("src", contextPath + uiImageOutput.getPath(), "url");
        responseWriter.writeAttribute("width", uiImageOutput.getWidth(), "width");
        responseWriter.writeAttribute("height", uiImageOutput.getHeight(), "height");

        responseWriter.endElement("td");
        responseWriter.endElement("tr");

        // "tr" element
        responseWriter.startElement("tr", uiImageOutput);
        // "td" element (links)
        responseWriter.startElement("td", uiImageOutput);

        // Previous image link
        responseWriter.startElement("input", uiImageOutput);
        responseWriter.writeAttribute("type", "button" , null);
        responseWriter.writeAttribute("value", "Previous" , null);
        responseWriter.writeAttribute("onClick", "javascript:" + postBack + "(this)", null);
        responseWriter.writeAttribute("id", previousLink(ctx, ui_comp), null);
        responseWriter.endElement("input");

        // Next image link
        responseWriter.startElement("input", uiImageOutput);
        responseWriter.writeAttribute("type", "button" , null);
        responseWriter.writeAttribute("value", "Next" , null);
        responseWriter.writeAttribute("onClick", "javascript:" + postBack + "(this)", null);
        responseWriter.writeAttribute("id", nextLink(ctx, ui_comp), null);
        responseWriter.endElement("input");

        responseWriter.endElement("td");
        responseWriter.endElement("tr");

        responseWriter.endElement("table");
    }

    @Override
    public void decode(FacesContext ctx, UIComponent ui_comp) {

        if ((ctx == null) || (ui_comp == null)) { throw new NullPointerException(); }

        UIImageOutput uiImageOutput = (UIImageOutput)ui_comp;
      
        String hidden_field = hiddenField(ctx, uiImageOutput);
        Map paramsMap = ctx.getExternalContext().getRequestParameterMap();
        String valH = (String)paramsMap.get(hidden_field);

        String[] img_paths = uiImageOutput.getPaths();
        int img_index = uiImageOutput.getImgIndex();

        if (valH.equals(previousLink(ctx, ui_comp))){
            if (img_index > 0){
                img_index = img_index-1;
                uiImageOutput.setImgIndex(img_index);
            }
        }else if (valH.equals(nextLink(ctx, ui_comp))){
            if (img_index < img_paths.length - 1){
                img_index = img_index+1;
                uiImageOutput.setImgIndex(img_index);
            }
        }
        uiImageOutput.setPath(img_paths[img_index]);
    }
}
