package numbers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NumbersBean {

    private double doubleNumber = 12345.12345;

    public double getDoubleNumber(){
        return this.doubleNumber;
    }

    public void setDoubleNumber(double doubleNumber){
        this.doubleNumber=doubleNumber;
    }

}
