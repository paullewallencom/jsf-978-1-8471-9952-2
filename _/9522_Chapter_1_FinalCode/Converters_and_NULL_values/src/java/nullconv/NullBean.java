package nullconv;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Date;

@ManagedBean
@SessionScoped
public class NullBean {

    //valid date
    //private Date currentdate = new Date();
    //null date
    private Date currentdate = null;
    //placebo date
    private Date nulldate = new Placebo();

    public Date getCurrentdate() {
        if (currentdate == null) {
            return nulldate;
        }
        return this.currentdate;
    }

    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }
}

//placebo class for java.util.Date
class Placebo extends java.util.Date {

    @Override
    public int hashCode() {
        return 0011001100;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Placebo other = (Placebo) obj;
        return true;
    }
   
}
