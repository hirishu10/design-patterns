package ProxyPattern;

import ProxyPattern.Concreate.ProxyPrintingClass;

public class ProxyExample {

    public static void main(String[] args) {
        var stringToPrint = new ProxyPrintingClass("Hello World");

        stringToPrint.printInsideConsole();

        stringToPrint.printInsideConsole();

        var n = new ProxyPrintingClass("Second World");
        n.printInsideConsole();

    }
}
