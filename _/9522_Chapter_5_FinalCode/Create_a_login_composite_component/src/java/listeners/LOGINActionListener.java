package listeners;

import javax.faces.component.UIComponent;
import javax.faces.component.ValueHolder;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class LOGINActionListener implements ActionListener {

    public void processAction(ActionEvent evt) throws AbortProcessingException {

        FacesContext ctx = FacesContext.getCurrentInstance();

        UIComponent ui_comp = evt.getComponent();
        ValueHolder user, pwd;
        user = (ValueHolder) ui_comp.findComponent("usernameID");
        pwd = (ValueHolder) ui_comp.findComponent("passwordID");

        String msg = "Login fired!"
                + " User: " + user.getValue()
                + " Password: " + pwd.getValue();

        ctx.getExternalContext().getRequestMap().put("LOGINActionMessage", msg);

    }
}

