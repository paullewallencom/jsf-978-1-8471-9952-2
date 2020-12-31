package converterJSF;

import java.util.Collection;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import org.apache.myfaces.trinidad.convert.ClientConverter;
import org.apache.myfaces.trinidad.util.LabeledFacesMessage;

/**
 * <p>IP converter.</p>
 *
 */
public class IPConverter implements Converter, ClientConverter
{
  private static final String _SHORT_ERROR_TEXT = "The value is to short for an IP of type 000.000.000.000!";
  private static final String _LONG_ERROR_TEXT = "The value is to long for an IP of type 000.000.000.000!";
  private static final String _INVALID_ERROR_TEXT = "The value is not a valid IP number";
  public static final String CONVERTER_ID = "converterJSF.IP";

  //getAsObject
  public Object getAsObject(FacesContext context, UIComponent component, String value)
	    {	      
	      if ( value == null || value.trim().length() == 0)
	        return null;

	      String ipValue = value.trim();
	      
	      int length = ipValue.length();
	      
	      if ( length < 12 )
	      {
	        throw new ConverterException(_getMessage(component, _SHORT_ERROR_TEXT));
	      }

	      if ( length > 15 )
	      {
	        throw new ConverterException(_getMessage(component, _LONG_ERROR_TEXT));
	      }

	      //12
	      if (length == 12)
	      {
	        try
	        {
	          return Long.valueOf(ipValue);
	        }
	        catch(NumberFormatException e)
	        {
	          throw new ConverterException(_getMessage(component, _INVALID_ERROR_TEXT));
	        }
	      }
	      
	      //16
	      if (length == 15)
	      {
	        try
	        {
	        String extractIP = ipValue.substring(0,3) + ipValue.substring(4,7) + ipValue.substring(8,11) + ipValue.substring(12,15);
	       
	          return Long.valueOf(extractIP);
	        }
	        catch(NumberFormatException e)
	        {
	          throw new ConverterException(_getMessage(component, _INVALID_ERROR_TEXT));
	        }
	      }

	    throw new ConverterException(_getMessage(component, _INVALID_ERROR_TEXT));
	    }

  //getAsString
  public String getAsString(FacesContext context, UIComponent component, Object value)
	    {
	      if ( value == null || !(value instanceof Long))
	        return null;
	      
      	  Long longValue=(Long)value;
	      String valueString = longValue.toString();	      	      
	      
	      String ip="000.000.000.000";
	      if (valueString.length() == 12) 
	      {
	     ip = valueString.substring(0,3) + '.' +
	                   valueString.substring(3,6) + '.' +
	                   valueString.substring(6,9) + '.' +
	                   valueString.substring(9,12);
	      }
	      return ip;
	    }


	  public Collection<String> getClientImportNames()
	  {
	    return null;
	  }

	  public String getClientLibrarySource(
	   FacesContext context)
	  {
	    return context.getExternalContext().getRequestContextPath() + 
	            "/jsLibs/IPConverter.js";    
	  }

  public String getClientConversion(FacesContext context, UIComponent component)
  {  
    return ("new IPConverter({"
            + "SUM:'Invalid IP.',"
            + "S:'Value \"{1}\" is too short for an 000.000.000.000 IP.',"
            + "L:'Value \"{1}\" is too long for an 000.000.000.000 IP.',"
            + "N:'Value \"{1}\" is not a valid IP of type 000.000.000.000 .'})"
            );
  }

  public String getClientScript(FacesContext context, UIComponent component)
  {
    return null;
  }
  
  private LabeledFacesMessage _getMessage(UIComponent component, String text)
  {
    // Using the LabeledFacesMessage allows the <tr:messages> component to
    // properly prepend the label as a link.
    LabeledFacesMessage lfm =
      new LabeledFacesMessage(FacesMessage.SEVERITY_ERROR,
                              "Conversion Error", text);
    if (component != null)
    {
      Object label = null;
      label = component.getAttributes().get("label");
      if (label == null)
        label = component.getValueExpression("label");
      if (label != null)
        lfm.setLabel(label);
    }
    return lfm;
  }
}
