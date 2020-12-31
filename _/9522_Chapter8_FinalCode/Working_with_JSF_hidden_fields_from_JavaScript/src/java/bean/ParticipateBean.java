package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ParticipateBean {

    private Boolean participate = true;

    public Boolean getParticipate() {
        return participate;
    }

    public void setParticipate(Boolean participate) {
        this.participate = participate;
    }
}
