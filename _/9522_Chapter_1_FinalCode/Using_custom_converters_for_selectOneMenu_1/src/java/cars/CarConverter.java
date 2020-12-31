package cars;

import javax.el.ValueExpression;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "carConverter")
public class CarConverter implements Converter {
    
    /* (non-Javadoc)
     * @see javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.Object)
     */
       public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {

        if (arg0 == null) { throw new NullPointerException("context"); }
	if (arg1 == null) { throw new NullPointerException("component"); }

        return ((CarBean)arg2).getCarNumber().toString();
    }

    /* (non-Javadoc)
     * @see javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.String)
     */    
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {

        if (arg0 == null) { throw new NullPointerException("context"); }
	if (arg1 == null) { throw new NullPointerException("component"); }

        FacesContext ctx = FacesContext.getCurrentInstance();
        ValueExpression vex = ctx.getApplication().getExpressionFactory().createValueExpression(ctx.getELContext(), "#{carsBean}",CarsBean.class);
        CarsBean cars = (CarsBean)vex.getValue(ctx.getELContext());

         CarBean car;
        try {            
        car = cars.getCar(new Integer (arg2));
        } catch( NumberFormatException e ) {
            FacesMessage message = new FacesMessage( FacesMessage.SEVERITY_ERROR,
                "Unknown value", "This is not a  car number!" );
            throw new ConverterException( message );
        }

        if( car == null ) {
            FacesMessage message = new FacesMessage( FacesMessage.SEVERITY_ERROR,
                "Unknown value", "The car is unknown!" );
            throw new ConverterException( message );
        }

        return car;
    }
}
