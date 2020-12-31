package colorpicker;

import java.awt.Color;
import java.util.StringTokenizer;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value="rgbConverter")
public class RGBConverter implements Converter {

	public static final String CONVERTER_ID = "rgbConverter";

	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {

		if (context == null) {
			throw new NullPointerException("context");
		}

		if (component == null) {
			throw new NullPointerException("component");
		}

		String getRGBfromString = value.substring(4, value.length() - 1);
		StringTokenizer rgbComponents = new StringTokenizer(getRGBfromString,",");

		int r = Integer.valueOf(rgbComponents.nextToken().trim());
		int g = Integer.valueOf(rgbComponents.nextToken().trim());
		int b = Integer.valueOf(rgbComponents.nextToken().trim());

		Color rgbColor = new Color(r, g, b);

		int rgbValue = rgbColor.getRGB();

		Integer rgbValueInt = new Integer(rgbValue);

		return rgbValueInt;
	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) {

		if (context == null) {
			throw new NullPointerException("context");
		}

		if (component == null) {
			throw new NullPointerException("component");
		}

		Color rgbColor = new Color((Integer) value);

		String stringRGB = "rgb(" + rgbColor.getRed() + ","
				+ rgbColor.getGreen() + "," + rgbColor.getBlue() + ")";
		return stringRGB;
	}

}
