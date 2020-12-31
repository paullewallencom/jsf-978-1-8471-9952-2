package users;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserBean {

    private int userAge;

    public int getUserAge(){
        return this.userAge;
    }

    public void setUserAge(int userAge){
        this.userAge=userAge;
    }

}
