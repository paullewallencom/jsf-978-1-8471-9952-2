package custom.component;

import javax.faces.component.UIComponent;
import javax.faces.component.ValueHolder;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.component.UIInput;
import com.sun.faces.renderkit.html_basic.TextRenderer;

import java.io.IOException;

public class UIEmailInputRender extends TextRenderer {

    @Override
    public void encodeEnd(FacesContext ctx, UIComponent ui_comp) throws IOException {

        ResponseWriter responseWriter = ctx.getResponseWriter();
        responseWriter.startElement("input", ui_comp);

        String id = (String) ui_comp.getClientId(ctx);
        responseWriter.writeAttribute("id", id, "id");
        responseWriter.writeAttribute("name", id, "id");
        responseWriter.writeAttribute("value", getValue(ui_comp), "value");

        responseWriter.writeAttribute("type", (String) ui_comp.getAttributes().get("type"), null);
        responseWriter.writeAttribute("invalidMessage", (String) ui_comp.getAttributes().get("invalidMessage"), null);
        responseWriter.writeAttribute("regExp", (String) ui_comp.getAttributes().get("regExp"), null);
        responseWriter.writeAttribute("dojoType", (String) ui_comp.getAttributes().get("dojoType"), null);
        responseWriter.writeAttribute("required", (String) ui_comp.getAttributes().get("dojoRequired"), null);
        responseWriter.writeAttribute("promptMessage", (String) ui_comp.getAttributes().get("promptMessage"), null);

        responseWriter.endElement("input");
    }

    @Override
    protected Object getValue(UIComponent ui_comp) {

        Object objValue = null;
        if (ui_comp instanceof UIInput) {
            objValue = ((UIInput)ui_comp).getSubmittedValue();
        }
        if ((objValue == null) && (ui_comp instanceof ValueHolder)) {
            objValue = ((ValueHolder) ui_comp).getValue();
        }
        if (objValue == null) {
            objValue = "";
        }
        return objValue;
    }
}
