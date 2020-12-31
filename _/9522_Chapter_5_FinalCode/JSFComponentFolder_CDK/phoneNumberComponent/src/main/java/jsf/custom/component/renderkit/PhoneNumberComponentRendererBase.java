package jsf.custom.component.renderkit;

import java.io.IOException;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import org.ajax4jsf.renderkit.HeaderResourcesRendererBase;
import jsf.custom.component.component.UIPhoneNumberComponent;
import jsf.custom.component.component.converter.PhoneConverter;

public abstract class PhoneNumberComponentRendererBase extends HeaderResourcesRendererBase {

   public void decode(FacesContext ctx, UIComponent ui_comp){

     ExternalContext externalContext = ctx.getExternalContext();     
     Map paramsOnRequest = externalContext.getRequestParameterMap();
     
     UIPhoneNumberComponent uiPhoneNumberComponent = (UIPhoneNumberComponent)ui_comp;
     String clientId = uiPhoneNumberComponent.getClientId(ctx);
     String submittedValue = (String)paramsOnRequest.get(clientId);
     
     if (submittedValue != null) {
        uiPhoneNumberComponent.setSubmittedValue(submittedValue);
    }
  }    

  public String getValueAsString(FacesContext ctx, UIComponent ui_comp) throws IOException {

     UIPhoneNumberComponent uiPhoneNumberComponent = (UIPhoneNumberComponent)ui_comp;
     String valueString = (String)uiPhoneNumberComponent.getSubmittedValue();
     
     if (valueString == null) {
	Object value = uiPhoneNumberComponent.getValue();	 
        if (value != null) {                  
                  
	   Converter converter = getConverter(ctx, uiPhoneNumberComponent);
   	   valueString = converter.getAsString(ctx, ui_comp, value);
	   }
	}
     return valueString;
  }
		
  public Object getConvertedValue(FacesContext ctx, UIComponent ui_comp, Object submittedValue) throws ConverterException
  {
     UIPhoneNumberComponent uiPhoneNumberComponent = (UIPhoneNumberComponent)ui_comp;

     Converter converter = getConverter(ctx, uiPhoneNumberComponent);
     String valueString = (String)submittedValue;     
    
     return converter.getAsObject(ctx, ui_comp, valueString);
  }
	
  private Converter getConverter(FacesContext ctx, UIPhoneNumberComponent uiPhoneNumberComponent)
  {
  Converter converter = uiPhoneNumberComponent.getConverter();
  if (converter == null)
	{
	PhoneConverter phoneConverter = new PhoneConverter();	
	converter=phoneConverter;
	}
     return converter;
  }
  
}

