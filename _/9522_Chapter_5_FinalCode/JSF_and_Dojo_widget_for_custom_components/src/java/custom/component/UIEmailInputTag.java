package custom.component;

import com.sun.faces.taglib.html_basic.InputTextTag;
import javax.faces.component.UIComponent;

public class UIEmailInputTag extends InputTextTag {

    @Override
    public String getComponentType() {
        return "javax.faces.HtmlInputText";
    }

    @Override
    public String getRendererType() {
        return "jsf.dojo.render";
    }
    private String promptMessage;
    private String invalidMessage;
    private String dojoRequired;
    private String regExp;
    private String dojoType;
    private String type;

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public String getInvalidMessage() {
        return invalidMessage;
    }

    public void setInvalidMessage(String invalidMessage) {
        this.invalidMessage = invalidMessage;
    }

    public String getDojoRequired() {
        return dojoRequired;
    }

    public void setDojoRequired(String dojoRequired) {
        this.dojoRequired = dojoRequired;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegExp() {
        return regExp;
    }

    public void setRegExp(String regExp) {
        this.regExp = regExp;
    }

    public String getDojoType() {
        return dojoType;
    }

    public void setDojoType(String dojoType) {
        this.dojoType = dojoType;
    }

    @Override
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        component.getAttributes().put("promptMessage", promptMessage);
        component.getAttributes().put("dojoRequired", dojoRequired);
        component.getAttributes().put("invalidMessage", invalidMessage);
        component.getAttributes().put("type", type);
        component.getAttributes().put("dojoType", dojoType);
        component.getAttributes().put("regExp", regExp);

    }
}
