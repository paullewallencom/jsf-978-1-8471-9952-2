package downloadbeanpkg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.faces.context.FacesContext;

public class DownloadBean {

    public byte[] getPdf() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        InputStream is = null;
        try {
            is = //Thread.currentThread().getContextClassLoader().getResourceAsStream("/RafaNadal.pdf");
            FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/RafaNadal.pdf");

            int count = 0;
            byte[] buffer = new byte[4096];
            while ((count = is.read(buffer)) != -1) {
                if (count > 0) {
                    baos.write(buffer, 0, count);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {
                    //  just make sure it's closed
                }
            }

        }
        return baos.toByteArray();
    }

    public byte[] getImage() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        InputStream is = null;
        try {
            is = //Thread.currentThread().getContextClassLoader().getResourceAsStream("/RafaNadal.png");
            FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/RafaNadal.jpg");

            int count = 0;
            byte[] buffer = new byte[4096];
            while ((count = is.read(buffer)) != -1) {
                if (count > 0) {
                    baos.write(buffer, 0, count);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {
                    //  just make sure it's closed
                }
            }

        }
        return baos.toByteArray();
    }
}
