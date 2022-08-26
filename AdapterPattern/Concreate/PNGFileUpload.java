package AdapterPattern.Concreate;

import AdapterPattern.Interface.AdvancedUploader;
public class PNGFileUpload implements AdvancedUploader {

    @Override
    public void advancedUploader(String fileType, String fileName) {
        System.out.println("Your " + fileType + " file: " + fileName + " successfully uploaded.");
    }
}
