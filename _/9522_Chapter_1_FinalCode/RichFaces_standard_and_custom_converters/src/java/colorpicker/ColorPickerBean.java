package colorpicker;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "colorPickerBean")
@SessionScoped
public class ColorPickerBean {

    /** Creates a new instance of ColorPickerBean */
    public ColorPickerBean() {
    }
    private Integer color = -12074815;

    /**
     * @return ColorPickerBean color
     */
    public Integer getColor() {
        return color;
    }

    /**
     * @param ColorPickerBean color
     */
    public void setColor(Integer color) {
        this.color = color;
    }
}
