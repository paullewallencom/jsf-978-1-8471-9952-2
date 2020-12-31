package custom.component;

import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.webapp.UIComponentTag;

public class UIEmailInputTag extends UIComponentTag {

      private String value;

 public String getComponentType() {
    return "EMAIL_INPUT";
  }

  public String getRendererType() {
    return "EMAIL_RENDERER";
  }

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  protected void setProperties(UIComponent ui_comp) {

FacesContext ctx = FacesContext.getCurrentInstance();

    super.setProperties(ui_comp);

     if (null != value) {
      if (isValueReference(value)) {
        ValueBinding valueBiding = ctx.getApplication().createValueBinding(value);
        ui_comp.setValueBinding("value", valueBiding);
      } else {
        ((UIInput) ui_comp).setValue(value);
      }
     }
  }
}
