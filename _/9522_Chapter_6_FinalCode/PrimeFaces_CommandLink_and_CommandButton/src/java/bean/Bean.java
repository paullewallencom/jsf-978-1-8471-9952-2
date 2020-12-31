package bean;

import java.util.Random;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "bean")
@RequestScoped
public class Bean {

    private String nick;

    /** Creates a new instance of newMemberBean */
    public Bean() {
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void nickAction(ActionEvent actionEvent) {

        Random check = new Random();
        int val = check.nextInt(100);

        if (val < 50) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "This ID is available!", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "This ID is not available!", ""));
        }
    }
}

