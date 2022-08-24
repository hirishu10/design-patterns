package CommandPattern.Concreate;

import CommandPattern.Interface.CommandInterface;

public class GoBack implements CommandInterface {
    SearchList searchList;
    SearchEngine searchEngine = new SearchEngine();

    public GoBack(SearchList searchList) {
        this.searchList = searchList;
    }

    @Override
    public void execute() {
        this.searchList.goBack();

        if(this.searchEngine.getSearchCommands().size() <= 0){
            System.out.println("Welcome to Home Page of Search Engine");
        }
    }
}
