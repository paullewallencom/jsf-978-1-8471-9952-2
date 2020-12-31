package users;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.validator.LongRangeValidator;

@ManagedBean
@SessionScoped
public class UserBean {

    private int userAge;
    private LongRangeValidator longAge;

    public int getUserAge(){
        return this.userAge;
    }

    public void setUserAge(int userAge){
        this.userAge=userAge;
    }

    public LongRangeValidator getLongAge(){
        return this.longAge;
    }

    public void setLongAge(LongRangeValidator longAge){
        longAge.setMinimum(18);
        longAge.setMaximum(90);
        this.longAge=longAge;
    }

}
