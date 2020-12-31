package bean;

import java.io.FileInputStream;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean(name = "downloadBean")
@RequestScoped
public class DownloadBean {

    private StreamedContent file;

    public DownloadBean() {

        ExternalContext extContext = FacesContext.getCurrentInstance().getExternalContext();

        try {
            file = new DefaultStreamedContent(new FileInputStream(extContext.getRealPath("/download/primefaces.pdf")), "application/pdf", "primefaces.pdf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public StreamedContent getFile() {
        return file;
    }

    public void setFile(StreamedContent file) {
        this.file = file;
    }
}
