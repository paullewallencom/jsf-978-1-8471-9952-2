package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Bean {

    public void listenerNewWindow() {
        System.out.println("Listener New Window");
    }

    public void actionNewWindow() {
        System.out.println("Action New Window");
    }
}
