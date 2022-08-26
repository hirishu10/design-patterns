package AdapterPattern.Concreate;

import AdapterPattern.Interface.AdvancedUploader;
import AdapterPattern.Interface.Uploader;

public class SVGFileUpload implements AdvancedUploader {

    @Override
    public void advancedUploader(String fileType, String fileName) {
        System.out.println("Your " + fileType + " file: " + fileName + " successfully uploaded.");
    }
}
