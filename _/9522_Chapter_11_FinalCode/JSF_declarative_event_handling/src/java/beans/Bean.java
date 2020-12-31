package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Anghel Leonard
 */
@ManagedBean
@SessionScoped
public class Bean {

    private String number = "";

    public Bean() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void initNumber() {
        setNumber("2010");
    }
}
