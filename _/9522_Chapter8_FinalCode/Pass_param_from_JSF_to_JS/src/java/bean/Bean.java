package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Bean {

    private String text = "JSF_2";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
