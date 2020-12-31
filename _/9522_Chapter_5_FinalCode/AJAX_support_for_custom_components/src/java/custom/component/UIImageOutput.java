package custom.component;

import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;

public class UIImageOutput extends UIOutput {

    private static final String IMAGE_FAMILY = "IMAGE_FAMILY";

    private String width;
    private String height;    
    private String path;
    private String[] paths;
    private int imgIndex;

    
    public int getImgIndex() {
        return imgIndex;
    }

    public void setImgIndex(int imgIndex) {
        this.imgIndex = imgIndex;
    }

    public String[] getPaths() {
        return paths;
    }

    public void setPaths(String[] paths) {
        this.paths = paths;
    }
   
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }   

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

  public UIImageOutput() {
    super();
    }
  
  @Override
   public Object saveState(FacesContext cxt) {

     Object state[] = new Object[5];

     state[0] = super.saveState(cxt);
     state[1] = paths;
     state[2] = new Integer(imgIndex);
     state[3] = width;
     state[4] = height;
     return state;
 }

  @Override
  public void restoreState(FacesContext cxt, Object obj) {

    Object state[] = (Object[])obj;

    super.restoreState(cxt,state[0]);
    paths = (String[])state[1];
    imgIndex = ((Integer)state[2]).intValue();
    width =  (String)state[3];
    height = (String)state[4];
 }  

  @Override
  public String getFamily() {
    return IMAGE_FAMILY;
  }

}
