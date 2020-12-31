package custom.component;

import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentELTag;

public class UIImageOutputTag extends UIComponentELTag {

  private static final String IMAGE_OUTPUT = "IMAGE_OUTPUT";
  private static final String IMAGE_RENDERER = "IMAGE_RENDERER";

  private String width;
  private String height;
  private String path;

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

 public String getComponentType() {
  return IMAGE_OUTPUT;
}

public String getRendererType() {
  return IMAGE_RENDERER;
}

  @Override
  protected void setProperties(UIComponent ui_comp) {

        super.setProperties(ui_comp);

        UIImageOutput uiImageOutput = (UIImageOutput)ui_comp;

        if (path != null) {
            String[] imgPaths = path.trim().split(",");
            uiImageOutput.setPath(imgPaths[0]);
            uiImageOutput.setPaths(imgPaths);            
        }

        if (width != null) {
            uiImageOutput.setWidth(width);
        }

        if (height != null) {
            uiImageOutput.setHeight(height);
        }
    }
}
