package jsf.custom.component.component.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "PhoneConverter")
public class PhoneConverter implements Converter {

    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {

        if (arg0 == null) {
            throw new NullPointerException("context");
        }
        if (arg1 == null) {
            throw new NullPointerException("component");
        }

        String s = String.valueOf(arg2);

        if (s.length() != 10) {
            return "0000-00000-0";
            }
        
        String phoneNumber = s.substring(0,4) + "-" + s.substring(4,9) + "-" + s.substring(9,10);

        return phoneNumber;
    }

    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {

        if (arg0 == null) {
            throw new NullPointerException("context");
        }
        if (arg1 == null) {
            throw new NullPointerException("component");
        }

        try {            
            String start = arg2.substring(0,4);
            String midle = arg2.substring(5,10);
            String end = arg2.substring(11,12);
                     
            String phoneNumber = start + midle + end;
            
            return phoneNumber;
            
        } catch (Exception e) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Parser error! - Cannot convert this phone number from xxxx-xxxxx-x to xxxxxxxxxx!", "Cannot convert this phone number from xxxx-xxxxx-x to xxxxxxxxxx!");
            throw new ConverterException(message);

        }
    }
}

