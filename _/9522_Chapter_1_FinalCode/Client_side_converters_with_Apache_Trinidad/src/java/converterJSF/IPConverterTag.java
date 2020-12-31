package converterJSF;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.webapp.ConverterELTag;

import javax.servlet.jsp.JspException;

public class IPConverterTag extends ConverterELTag
{

  public IPConverterTag()
  {
  }

  /**
   * 
   */
  @Override
  protected Converter createConverter() throws JspException
  {
    Application app = FacesContext.getCurrentInstance().getApplication();
    IPConverter converter = (IPConverter)app.createConverter(IPConverter.CONVERTER_ID);
    return converter;
  }
}
