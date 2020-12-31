package ip;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class IpBean {

    private String ipValue;

    public String getIpValue() {
        return this.ipValue;
    }

    public void setIpValue(String ipValue) {
        this.ipValue = ipValue;
    }
}
