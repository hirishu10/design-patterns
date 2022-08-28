package ProxyPattern.Concreate;

import ProxyPattern.Interface.StringConsole;

public class PrintingClass implements StringConsole {

    private final String consoleString;

    public PrintingClass(String consoleString) {
        this.consoleString = consoleString;
    }

    @Override
    public void printInsideConsole() {
        System.out.println("Your " + this.consoleString +" is in the console :)");
    }
}
