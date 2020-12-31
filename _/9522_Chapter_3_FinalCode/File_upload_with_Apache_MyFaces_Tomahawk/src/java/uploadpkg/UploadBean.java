package uploadpkg;

import org.apache.myfaces.custom.fileupload.UploadedFile;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class UploadBean {

    private UploadedFile uploadedFile;
    private String fileName;

    public UploadedFile getUploadedFile() {
        return uploadedFile;
    }

    public String getFileName() {
        return fileName;
    }

     public void setUploadedFile(UploadedFile uploadedFile) {
        this.uploadedFile = uploadedFile;
    }
     
    public void submit() {

        // Get information you from the uploaded file
    	System.out.println("Uploaded file name: " + uploadedFile.getName());
        System.out.println("Uploaded file type: " + uploadedFile.getContentType());        
        System.out.println("Uploaded file size: " + uploadedFile.getSize() + " bytes");
        
        try {
        	//Upload success
            FacesContext.getCurrentInstance().addMessage("uploadForm", new FacesMessage(
                FacesMessage.SEVERITY_INFO, "File upload was a total success!", null));

        } catch (Exception e) {

            //Upload failed
            FacesContext.getCurrentInstance().addMessage("uploadForm", new FacesMessage(
                FacesMessage.SEVERITY_ERROR, "File upload was a failed.", null));       
            e.printStackTrace();
        }
    }

}