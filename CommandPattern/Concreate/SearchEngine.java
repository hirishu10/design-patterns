package CommandPattern.Concreate;

import CommandPattern.Interface.CommandInterface;

import java.util.ArrayList;

public class SearchEngine {

    private ArrayList<CommandInterface> searchCommands = new ArrayList<>();

    public ArrayList<CommandInterface> getSearchCommands() {
        return searchCommands;
    }

    public void getCommand(CommandInterface command){
        searchCommands.add(command);
    }

    public void runCommands(){
        for(CommandInterface command : searchCommands){
            command.execute();
        }

        searchCommands.clear();
    }


}
