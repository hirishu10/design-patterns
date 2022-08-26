package AdapterPattern;

import AdapterPattern.Concreate.FileUpload;

public class AdapterExample {

    public static void main(String[] args) {

        FileUpload newFile = new FileUpload();
        newFile.upload("jpg","hello.jpg");
        newFile.upload("png","this.png");
        newFile.upload("svg","one.svg");
        newFile.upload("avi","notSupport.avi");
    }
}
