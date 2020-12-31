package users;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserBean {

    private int userAge;
    private String firstName;
    
    public int getUserAge(){
        return this.userAge;
    }

    public void setUserAge(int userAge){
        this.userAge=userAge;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

}
