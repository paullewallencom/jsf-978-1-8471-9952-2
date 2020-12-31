package multiply;

import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@SessionScoped
public class FactorBean {

    private List<SelectItem> factors = new LinkedList<SelectItem>();
    private double selectedFactor;

    public FactorBean() {
        factors.add(new SelectItem("1.0", "1.0"));
        factors.add(new SelectItem("2.0", "2.0"));
        factors.add(new SelectItem("3.0", "3.0"));
        factors.add(new SelectItem("4.0", "4.0"));
        factors.add(new SelectItem("5.0", "5.0"));
    }

    public List<SelectItem> getFactors() {
        return factors;
    }

    public void setCarItems(List<SelectItem> factors) {
        this.factors = factors;
    }

    public double getSelectedFactor() {
        return this.selectedFactor;
    }

    public void setSelectedFactor(double selectedFactor) {
        this.selectedFactor = selectedFactor;
    }
}
