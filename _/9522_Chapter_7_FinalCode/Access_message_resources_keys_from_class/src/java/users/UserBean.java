package users;

import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class UserBean {

    private int userAge;
    private String firstName;

    public int getUserAge() {
        return this.userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUserAgeInsert() {

        FacesContext context = FacesContext.getCurrentInstance();

        //get default locale
        Locale myLoc = context.getViewRoot().getLocale();

        //manually set a Locale for English
        //Locale myLoc=new Locale("en");

        //manually set a Locale for French
        //Locale myLoc=new Locale("fr");

        String message = LocaleHelper.getLocaleString(context.getApplication().getMessageBundle(), "USER_AGE", null, myLoc);

        return message;
    }

    public String getUserNameInsert() {

        FacesContext context = FacesContext.getCurrentInstance();

        //get default locale
        Locale myLoc = context.getViewRoot().getLocale();

        //manually set a Locale for English
        //Locale myLoc=new Locale("en");

        //manually set a Locale for French
        //Locale myLoc=new Locale("fr");
        String message = LocaleHelper.getLocaleString(context.getApplication().getMessageBundle(), "USER_NAME", null, myLoc);

        return message;
    }
}
