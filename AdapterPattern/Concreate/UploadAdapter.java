package AdapterPattern.Concreate;

import AdapterPattern.Interface.AdvancedUploader;
import AdapterPattern.Interface.Uploader;

public class UploadAdapter implements Uploader {

    AdvancedUploader uploadCorrectFile;

    public UploadAdapter(String fileType) {
        if(fileType.toLowerCase().equalsIgnoreCase("png")){
            this.uploadCorrectFile = new PNGFileUpload();
        }
        else if(fileType.toLowerCase().equalsIgnoreCase("svg")){
            this.uploadCorrectFile = new SVGFileUpload();
        }
    }

    @Override
    public void upload(String fileType, String fileName) {
       this.uploadCorrectFile.advancedUploader(fileType,fileName);
    }
}
