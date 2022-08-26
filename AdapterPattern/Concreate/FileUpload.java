package AdapterPattern.Concreate;

import AdapterPattern.Interface.Uploader;

public class FileUpload implements Uploader {

    UploadAdapter uploadAdapter;

    @Override
    public void upload(String fileType, String fileName) {
        // We don't call adapter for jpg uploading file we have inbuilt option for uploading.
        if(fileType.toLowerCase().equalsIgnoreCase("jpg")){
            System.out.println("Your " + fileType + " file: " + fileName + " successfully uploaded.");
        }
        else if(checkFileType(fileType)){
            this.uploadAdapter = new UploadAdapter(fileType);
            this.uploadAdapter.upload(fileType,fileName);
        }
        else{
            System.out.println("Invalid type. " + fileType + " format not supported we are improving to support other fileType.");
        }
    }

    private static boolean checkFileType(String fileType){

        if(fileType.toLowerCase().equalsIgnoreCase("png")){
            return true;
        }
        else if(fileType.toLowerCase().equalsIgnoreCase("svg")){
            return true;
        }

        return false;
    }
}
