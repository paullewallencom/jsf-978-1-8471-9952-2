package uploadpkg;

import java.io.File;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.richfaces.event.UploadEvent;
import org.richfaces.model.UploadItem;

@ManagedBean(name = "fileUploadBean")
@SessionScoped
public class FileUploadBean implements Serializable {

    public void listener(UploadEvent event) {
        UploadItem item = event.getUploadItem();
        System.out.println("File : '" + item.getFileName() + "' was uploaded");
        if (item.isTempFile()) {
            File file = item.getFile();
            System.out.println("Absolute Path : '" + file.getAbsolutePath() + "'!");
            //file.delete();
        } else {
            try {
                byte[] bytes = item.getData();
                int numberOfBytes = 256;

                if (bytes.length > numberOfBytes) {
                    System.out.println("First " + numberOfBytes + " bytes of uploaded file:");
                    System.out.println(new String(bytes, 0, numberOfBytes));
                } else {
                    System.out.println("Uploaded file contents:");
                    System.out.println(new String(bytes, 0, bytes.length));
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
