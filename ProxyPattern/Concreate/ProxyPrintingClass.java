package ProxyPattern.Concreate;

import ProxyPattern.Interface.StringConsole;

public class ProxyPrintingClass implements StringConsole {

    private PrintingClass printingClass;
    private final String string;

    public ProxyPrintingClass(String string) {
        this.string = string;
    }

    @Override
    public void printInsideConsole() {
        if(this.printingClass == null){
            this.printingClass = new PrintingClass(string);
            this.printingClass.printInsideConsole();
        }
        else{
            this.printingClass.printInsideConsole();
        }
    }
}
