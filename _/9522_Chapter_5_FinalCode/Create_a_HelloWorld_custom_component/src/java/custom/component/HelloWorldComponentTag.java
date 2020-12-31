package custom.component;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentELTag;

public class HelloWorldComponentTag extends UIComponentELTag {
    // Mapping helloworld attribute to a bean property

    public ValueExpression helloworld = null;

    public String getComponentType() {
        return "HELLO_WORLD";
    }

    public String getRendererType() {
        return null;
    }

    public ValueExpression getHelloworld() {
        return helloworld;
    }

    public void setHelloworld(ValueExpression helloworld) {
        this.helloworld = helloworld;
    }

    @Override
    protected void setProperties(UIComponent ui_comp) {
        super.setProperties(ui_comp);

        if (!(ui_comp instanceof HelloWorldComponent)) {
            throw new IllegalStateException("Component " + ui_comp.toString() +
                    " is of wrong type!!!");
        }

        HelloWorldComponent helloWorldComponent = (HelloWorldComponent)ui_comp;

        if (helloworld != null) {
            helloWorldComponent.setValueExpression("helloworld", helloworld);
        }
    }
}
