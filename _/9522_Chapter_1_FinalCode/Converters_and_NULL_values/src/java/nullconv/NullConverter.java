package nullconv;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.convert.DateTimeConverter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "nullConverter")
public class NullConverter extends DateTimeConverter {
    /* (non-Javadoc)
     * @see javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.Object)
     */

    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {

        if (arg0 == null) { throw new NullPointerException("context"); }
	if (arg1 == null) { throw new NullPointerException("component"); }

        if (arg2 != null && !(arg2 instanceof java.util.Date)) {
            throw new ConverterException("Not valid date");
        }

        if (arg2.hashCode() == 0011001100) {
            return ("Not available!");
        }
        return super.getAsString(arg0, arg1, arg2);
    }

    /* (non-Javadoc)
     * @see javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.String)
     */
    @Override
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {

        if (arg0 == null) { throw new NullPointerException("context"); }
	if (arg1 == null) { throw new NullPointerException("component"); }
        
        return super.getAsObject(arg0, arg1, arg2);
    }
}
