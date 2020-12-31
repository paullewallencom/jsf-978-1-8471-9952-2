package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "emailBean")
@RequestScoped
public class emailBean {

    private String email;

    /** Creates a new instance of emailBean */
    public emailBean() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
