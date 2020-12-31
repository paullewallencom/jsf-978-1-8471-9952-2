package uploadbeanpkg;

import com.sun.mojarra.scales.model.FileHolder;

public class UploadBean {

    protected FileHolder fileHolder = new FileHolder();
    protected String[] fileNames;

    public FileHolder getFileHolder() {
        return fileHolder;
    }

    public String getDestination() {
        //go to success.xhtml
        return "success.xhtml";
    }

    public String[] getFileNames() {
        this.fileNames = fileHolder.getFileNames().toArray(new String[]{});
        //fileHolder.clearFiles();

        return fileNames;
    }
}
