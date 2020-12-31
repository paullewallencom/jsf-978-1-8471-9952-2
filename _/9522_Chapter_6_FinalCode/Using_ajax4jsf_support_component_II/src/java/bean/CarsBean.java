package bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

@ManagedBean(name = "carsBean")
@RequestScoped
public class CarsBean {

    private String carCompany = "Renault";
    private String carName;
    public List<SelectItem> allCars = new ArrayList<SelectItem>();
    public List<String> companyCars = new ArrayList<String>();
    private static final String[] carsRenault = new String[]{"Clio", "Clio  Estate", "Clio RS", "Symbol",
        "Fluence", "Sedan", "Megane", "Megane Coupe", "Megan Sport Tourer", "Scenic", "Grand Scenic", "Kangoo",
        "Coupe", "Koleos", "Espace", "Laguna", "Laguna Estate"};
    private static final String[] carsFiat = new String[]{"500", "Panda", "Punto Classic", "Grande Punto Unico",
        "Albea", "Bravo", "Linea", "Croma", "Sedici", "Doblo Panorama"};
    private static final String[] carsDacia = new String[]{"Sandero", "Logan", "Logan MCV", "Van", "Pick-up"};

    public CarsBean() {

        allCars.add(new SelectItem("Renault", "Renault"));
        allCars.add(new SelectItem("Fiat", "Fiat"));
        allCars.add(new SelectItem("Dacia", "Dacia"));

        for (int i = 0; i < carsRenault.length; i++) {
            companyCars.add(carsRenault[i]);
        }
    }

    public void companyChanged(ValueChangeEvent event) {
        companyCars.clear();

        if (((String) event.getNewValue()).equals("Renault")) {
            addCompanyCars(carsRenault);
        }
        if (((String) event.getNewValue()).equals("Fiat")) {
            addCompanyCars(carsFiat);
        }
        if (((String) event.getNewValue()).equals("Dacia")) {
            addCompanyCars(carsDacia);
        }
    }

    private void addCompanyCars(String[] currentCars) {

        companyCars.clear();

        for (int i = 0; i < currentCars.length; i++) {
            companyCars.add(currentCars[i]);
        }
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public List<SelectItem> getAllCars() {
        return allCars;
    }

    public void setAllCars(List<SelectItem> allCars) {
        this.allCars = allCars;
    }

    public List<String> getCompanyCars() {
        return companyCars;
    }

    public void setCompanyCars(List<String> companyCars) {
        this.companyCars = companyCars;
    }
}
