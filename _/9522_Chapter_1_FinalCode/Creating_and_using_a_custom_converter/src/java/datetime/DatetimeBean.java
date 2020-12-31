package datetime;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Date;

@ManagedBean
@SessionScoped
public class DatetimeBean {

    private Date currentdate = new Date();

    public Date getCurrentdate(){
        return this.currentdate;
    }

    public void setCurrentdate(Date currentdate){
        this.currentdate=currentdate;
    }

}
