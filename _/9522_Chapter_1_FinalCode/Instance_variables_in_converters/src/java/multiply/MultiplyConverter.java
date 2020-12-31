package multiply;

import javax.el.ValueExpression;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "multiplyConverter")
public class MultiplyConverter implements Converter {
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

        FacesContext ctx = FacesContext.getCurrentInstance();

        ValueExpression vex = ctx.getApplication().getExpressionFactory().createValueExpression(ctx.getELContext(), "#{factorBean}", FactorBean.class);
        FactorBean c = (FactorBean) vex.getValue(ctx.getELContext());

        try {
            Double dividedVal = (Double) arg2 / c.getSelectedFactor();

            return dividedVal.toString();
        } catch (Exception e) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Error!", "Connot accomplish this operation (DIVIDE) !");
            throw new ConverterException(message);
        }
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

        FacesContext ctx = FacesContext.getCurrentInstance();
        ValueExpression vex = ctx.getApplication().getExpressionFactory().createValueExpression(ctx.getELContext(), "#{factorBean}", FactorBean.class);
        FactorBean c = (FactorBean) vex.getValue(ctx.getELContext());

        try {
            Double val = new Double(arg2);
            Double multiplyVal = val * c.getSelectedFactor();

            return multiplyVal;

        } catch (NumberFormatException e) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Error!", "Connot accomplish this operation (MULTIPLY)!");
            throw new ConverterException(message);
        }

    }
}
