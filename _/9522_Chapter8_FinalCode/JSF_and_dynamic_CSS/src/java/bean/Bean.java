package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Bean {

    private String messageProperty = "message";
    private String messageFontProperty = "message-font";
    private String oddevenProperty = "odd, even";

    public String getMessageProperty() {
        return messageProperty;
    }

    public void setMessageProperty(String messageProperty) {
        this.messageProperty = messageProperty;
    }

    public String getMessageFontProperty() {
        return messageFontProperty;
    }

    public void setMessageFontProperty(String messageFontProperty) {
        this.messageFontProperty = messageFontProperty;
    }

    public String getOddevenProperty() {
        return oddevenProperty;
    }

    public void setOddevenProperty(String oddevenProperty) {
        this.oddevenProperty = oddevenProperty;
    }
}
