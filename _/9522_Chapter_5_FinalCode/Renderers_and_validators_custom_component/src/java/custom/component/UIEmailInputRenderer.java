package custom.component;

import java.io.IOException;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.ValueHolder;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;

public class UIEmailInputRenderer extends Renderer{

    @Override
  public void decode(FacesContext ctx, UIComponent ui_comp) {
    
  if (ctx == null) {
      throw new NullPointerException("NULL CONTEXT NOT ALLOWED!");
    } else if (ui_comp == null) {
        throw new NullPointerException("NULL COMPONENT NOT ALLOWED!");
    }

    if (ui_comp instanceof UIInput) {
      UIInput uiInput = (UIInput)ui_comp;
      String clientId = uiInput.getClientId(ctx);

      Map requestMap = ctx.getExternalContext().getRequestParameterMap();
      String new_value = (String)requestMap.get(clientId);
      if (null != new_value) {
        uiInput.setSubmittedValue(new_value);
      }
    }
  }

  @Override
  public void encodeEnd(FacesContext ctx, UIComponent ui_comp) throws IOException {

    if (ctx == null) {
      throw new NullPointerException("NULL CONTEXT NOT ALLOWED!");
    } else if (ui_comp == null) {
        throw new NullPointerException("NULL COMPONENT NOT ALLOWED!");
    }

    ResponseWriter responseWriter = ctx.getResponseWriter();

    responseWriter.startElement("input", ui_comp);
    responseWriter.writeAttribute("type", "text", "text");
    String id = (String)ui_comp.getClientId(ctx);
    responseWriter.writeAttribute("id", id, "id");
    responseWriter.writeAttribute("name", id, "id");

    Object obj = getValue(ui_comp);
    responseWriter.writeAttribute("value", formattingValue(obj), "value");
    responseWriter.endElement("input");
  }
  
  private String formattingValue(Object format_value) {
    return format_value.toString();
  }

  protected Object getValue(UIComponent ui_comp) {
    Object obj = null;
    if (ui_comp instanceof UIInput) {
      obj = ((UIInput) ui_comp).getSubmittedValue();
    }

    if ((null == obj) && (ui_comp instanceof ValueHolder)) {
      obj = ((ValueHolder) ui_comp).getValue();
    }

    return obj;
  }

}
