package CommandPattern;

import CommandPattern.Concreate.GoBack;
import CommandPattern.Concreate.NewSearch;
import CommandPattern.Concreate.SearchEngine;
import CommandPattern.Concreate.SearchList;

public class CommandExample {

    public static void main(String[] args) {
        SearchList searchOne = new SearchList("https://rishuchowdhary.vercel.app/");
        SearchList searchTwo = new SearchList("https://www.designpattern.com/");

        NewSearch searchingOne = new NewSearch(searchOne);
        GoBack goingBackFromSearchingOne = new GoBack(searchOne);
        NewSearch searchingTwo = new NewSearch(searchTwo);
        GoBack goingBackFromSearchingTwo = new GoBack(searchTwo);


        System.out.println("Welcome to Home Page of Search Engine");
        SearchEngine searchEngine = new SearchEngine();

        searchEngine.getCommand(searchingOne);
        searchEngine.getCommand(goingBackFromSearchingOne);
        searchEngine.getCommand(searchingTwo);
        searchEngine.getCommand(goingBackFromSearchingTwo);

        searchEngine.runCommands();




    }
}
