package TemplatePattern.Concreate;

import TemplatePattern.Abstract.LaptopLifeCycle;

public class MacBookAir extends LaptopLifeCycle {

    String user;

    public MacBookAir(String user) {
        this.user = user;
    }

    @Override
    public void powerOn() {
        System.out.println("→ Power on MacbookAir");
    }

    @Override
    public void displayUser() {
        System.out.println("→ Hello "+ this.user + "'s your MacbookAir is preparing for work.");
    }

    @Override
    public void shutDown() {
        System.out.println("→ Work done shut down the MacbookAir");
    }

    @Override
    public void powerOff() {
        System.out.println("→ Power off MacbookAir");
    }

    @Override
    public void work() {
        System.out.println("→ <::: Doing some really interesting work :::>");
    }
}
