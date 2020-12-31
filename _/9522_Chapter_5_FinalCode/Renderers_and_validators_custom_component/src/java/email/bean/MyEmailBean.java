package email.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MyEmailBean {

    private String email = "leoprivacy@yahoo.com";
    
   public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
