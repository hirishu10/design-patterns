package CommandPattern.Concreate;

public class SearchList {

    String url;

    public SearchList(String url) {
        this.url = url;
    }

    public void newSearch(){
        System.out.println("Searching for this URL: " + this.url);
    }
    public void goBack(){
        System.out.println("Going back from this url: " + this.url);
    }


}
