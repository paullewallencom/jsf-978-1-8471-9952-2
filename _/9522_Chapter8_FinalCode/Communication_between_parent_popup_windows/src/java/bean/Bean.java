package bean;

import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Bean {

    private String carCompany = "Renault";
    private String carName;
    private Map<String, String[]> allCars = new HashMap<String, String[]>();
    private static final String[] carsRenault = new String[]{"Clio", "Clio  Estate", "Clio RS", "Symbol",
        "Fluence", "Sedan", "Megane", "Megane Coupe", "Megan Sport Tourer", "Scenic", "Grand Scenic", "Kangoo",
        "Coupe", "Koleos", "Espace", "Laguna", "Laguna Estate"};
    private static final String[] carsFiat = new String[]{"500", "Panda", "Punto Classic", "Grande Punto Unico",
        "Albea", "Bravo", "Linea", "Croma", "Sedici", "Doblo Panorama"};
    private static final String[] carsDacia = new String[]{"Sandero", "Logan", "Logan MCV", "Van", "Pick-up"};

    public Bean() {
        allCars.put("Renault", carsRenault);
        allCars.put("Fiat", carsFiat);
        allCars.put("Dacia", carsDacia);
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

    public Map<String, String[]> getAllCars() {
        return allCars;
    }

    public void setAllCars(Map<String, String[]> allCars) {
        this.allCars = allCars;
    }


}
