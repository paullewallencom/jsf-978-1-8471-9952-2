package numbers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.convert.NumberConverter;

@ManagedBean
@SessionScoped
public class NumbersBean {

    private NumberConverter number;
    private float numbery;

    public float getNumbery() {
        return this.numbery;
    }

    public void setNumbery(float numbery) {
        this.numbery = numbery;
    }

    public NumberConverter getNumber() {
        return this.number;
    }

    public void setNumber(NumberConverter number) {
        number.setType("currency");
        number.setCurrencySymbol("$");
        this.number = number;
    }
}
