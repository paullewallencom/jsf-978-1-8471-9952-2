package beans;

import javax.faces.context.FacesContext;
import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.CroppedImage;

@ManagedBean(name="cropBean")
@SessionScoped
public class CropBean {

private CroppedImage  cropImage;

public CroppedImage  getCropImage() {
  return cropImage;
  }

public void setCropImage(CroppedImage cropImage) {
  this.cropImage = cropImage;
  }

public String crop() {
 ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
 String fileName = servletContext.getRealPath("") + File.separator + "images" + File.separator + "2009" + File.separator+ "rafael_nadal1.PNG";

 FileImageOutputStream imageOutput;
 try {
     imageOutput = new FileImageOutputStream(new File(fileName));
     imageOutput.write(cropImage.getBytes(), 0, cropImage.getBytes().length);
     imageOutput.close();
     } catch (FileNotFoundException e) {
            //log error
     } catch (IOException e) {
            //log error
    }
    return null;
    }
}

