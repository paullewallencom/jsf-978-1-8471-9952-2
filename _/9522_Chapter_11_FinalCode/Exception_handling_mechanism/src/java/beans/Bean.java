package beans;

import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Bean {

    private String number = "345";
    private String error = "";

    public Bean() {
    }

    public String getNumber() {

        try {
            Integer intnumber = Integer.valueOf(this.number);
            return String.valueOf(intnumber);
        } catch (NumberFormatException e) {
            throw new java.lang.NumberFormatException(e.getMessage());
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getError() {
        StringBuilder errorMessage = new StringBuilder();
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Map<String, Object> map = facesContext.getExternalContext().getRequestMap();

        Throwable throwable = (Throwable) map.get("javax.servlet.error.exception");

        if (throwable != null) {
            errorMessage.append(throwable.getMessage()).append("\n");
            for (StackTraceElement element : throwable.getStackTrace()) {
                errorMessage.append(element).append("\n");
            }
        }
        this.error = errorMessage.toString();
        return this.error;
    }
}
