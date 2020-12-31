package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Bean {

    private String text = "JSF";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void action() {
        System.out.println("The '" + text + "' value was setted by JavaScript!");
    }
}
