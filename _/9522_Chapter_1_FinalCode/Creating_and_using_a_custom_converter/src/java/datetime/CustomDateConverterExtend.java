package datetime;

import java.util.TimeZone;
import javax.faces.convert.DateTimeConverter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "customDateConverterExtend")
public class CustomDateConverterExtend extends DateTimeConverter {

    public CustomDateConverterExtend() {
        super();
        setTimeZone(TimeZone.getDefault());
        setPattern("yyyy-MM-dd");
    }
}
