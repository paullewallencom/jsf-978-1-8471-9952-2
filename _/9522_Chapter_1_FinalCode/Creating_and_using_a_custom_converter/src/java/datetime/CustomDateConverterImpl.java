package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "customDateConverterImpl")
public class CustomDateConverterImpl implements Converter {

    /* (non-Javadoc)
     * @see javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.Object)
     */
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {

        if (arg0 == null) {
            throw new NullPointerException("context");
        }
        if (arg1 == null) {
            throw new NullPointerException("component");
        }

        final Date date = (Date) arg2;
        String DATE_FORMAT = "yyyy-MM-dd";
        SimpleDateFormat sdf =
                new SimpleDateFormat(DATE_FORMAT);
        Calendar c1 = Calendar.getInstance(); // today
        c1.setTime(date);

        return sdf.format(c1.getTime());
    }

    /* (non-Javadoc)
     * @see javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.String)
     */
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {

        if (arg0 == null) {
            throw new NullPointerException("context");
        }
        if (arg1 == null) {
            throw new NullPointerException("component");
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date today = df.parse(arg2);
            return today;
        } catch (ParseException e) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Parser error!", "Cannot parse this date!");
            throw new ConverterException(message);

        }
    }
}
