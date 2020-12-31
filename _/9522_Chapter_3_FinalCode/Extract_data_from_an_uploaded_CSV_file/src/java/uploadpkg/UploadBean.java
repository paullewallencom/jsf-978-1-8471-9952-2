package uploadpkg;

import org.apache.myfaces.custom.fileupload.UploadedFile;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class UploadBean {

    private UploadedFile uploadedFile;
    private String fileName;
    private List<csvObject> csvs = new ArrayList<csvObject>();

    /**
	 * @return the csvs
	 */
	public List<csvObject> getCsvs() {
		return csvs;
	}

	/**
	 * @param csvs the csvs to set
	 */
	public void setCsvs(List<csvObject> csvs) {
		this.csvs = csvs;
	}

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
        	//get the uploaded file
        	InputStream inputStream = uploadedFile.getInputStream();
        	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        	
        	//define the byte size
        	byte bufferZone[] = new byte[1024];
        	
        	int read = 0;

        	//read CSV
        	while( (read = inputStream.read(bufferZone, 0,  (int) uploadedFile.getSize())) != -1 )
        	{
        		byteArrayOutputStream.write( bufferZone, 0, read);
        	}
        	
        	//assign it to string
        	String cvs = new String(byteArrayOutputStream.toByteArray());
        	
        	StringTokenizer stringTokenizer_1 = new StringTokenizer(cvs,"\r");
        	
        	stringTokenizer_1.nextToken();
        	while (stringTokenizer_1.hasMoreTokens()){
        		StringTokenizer stringTokenizer_2 = new StringTokenizer(stringTokenizer_1.nextToken(),",");
        		csvObject csvobj = new csvObject();
        		csvobj.setName(stringTokenizer_2.nextToken());        		
        		csvobj.setAge(Byte.valueOf(stringTokenizer_2.nextToken()));
        		csvobj.setEmail(stringTokenizer_2.nextToken());
        		
        		csvs.add(csvobj);
        	}
        	
        	this.setCsvs(csvs);        	    	      
        	
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
