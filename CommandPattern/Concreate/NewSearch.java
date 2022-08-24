package CommandPattern.Concreate;

import CommandPattern.Interface.CommandInterface;

public class NewSearch implements CommandInterface {
    SearchList searchList;

    public NewSearch(SearchList searchList) {
        this.searchList = searchList;
    }

    @Override
    public void execute() {
        this.searchList.newSearch();
    }
}
