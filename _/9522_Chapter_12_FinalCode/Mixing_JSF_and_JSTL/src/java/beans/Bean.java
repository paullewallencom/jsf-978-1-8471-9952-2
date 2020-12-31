package beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "bean")
@SessionScoped
public class Bean {

    private ArrayList cars = new ArrayList();

    public Bean() {
        cars.add("Clio");
        cars.add("Sandero");
        cars.add("Fiat");
        cars.add("Citroen");
    }

    public ArrayList getCars() {
        return cars;
    }

    public void setCars(ArrayList cars) {
        this.cars = cars;
    }
}
