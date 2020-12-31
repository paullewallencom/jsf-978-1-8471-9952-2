package custom;

import java.util.Date;

public class MyBean {

    private int orders = 5;
    private Date date = new Date();

    public MyBean() {       
    }

    public int getOrders() {
        return this.orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
