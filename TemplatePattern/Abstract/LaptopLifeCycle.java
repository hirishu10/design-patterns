package TemplatePattern.Abstract;

public abstract class LaptopLifeCycle {

    public abstract void powerOn();
    public abstract void displayUser();
    public abstract void shutDown();
    public abstract void powerOff();
    public abstract void work();

    // Template Method is final, so we can't alter this from concrete class
    public final void templateForWork(){
        powerOn();

        displayUser();

        work();

        shutDown();

        powerOff();
    }
}
