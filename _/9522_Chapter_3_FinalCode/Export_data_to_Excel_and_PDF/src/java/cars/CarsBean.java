package cars;

import java.util.LinkedList;
import java.util.List;

public class CarsBean {
   
    private List<CarBean> carItems = new LinkedList<CarBean>();

    public CarsBean() {
        CarBean car_1 = new CarBean(112332, "Ferrari");
        CarBean car_2 = new CarBean(233223, "Logan");
        CarBean car_3 = new CarBean(355333, "Fiat");
        CarBean car_4 = new CarBean(434222, "Kia");
        CarBean car_5 = new CarBean(542212, "Skoda");

        carItems.add(car_1);      
        carItems.add(car_2);       
        carItems.add(car_3);       
        carItems.add(car_4);       
        carItems.add(car_5);        
    }

   public List<CarBean> getCarItems() {
        return carItems;
    }

    public void setCarItems(List<CarBean> carItems) {
        this.carItems = carItems;
    }
} 
