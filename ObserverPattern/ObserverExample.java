package ObserverPattern;

import ObserverPattern.ConcreateClasses.BookStore;
import ObserverPattern.ConcreateClasses.CustomerClass;

public class ObserverExample {

    public static void main(String[] args) {

        BookStore freeBookStore = new BookStore("freeBookStore","Ganesh"); // We have BookStore
        freeBookStore.addNewBook("Programing With Fun :)", "Rishu Chowdhary");

        CustomerClass uhsir = new CustomerClass("Uhsir");
        CustomerClass personOne = new CustomerClass("personOne");
        CustomerClass personTwo = new CustomerClass("personTwo");

        // person are setting there bookStore
        uhsir.setBookStore(freeBookStore);
        personOne.setBookStore(freeBookStore);
        personTwo.setBookStore(freeBookStore);


        // freeBookStore register there new customers
        freeBookStore.newRegisterCustomer(uhsir);
        freeBookStore.newRegisterCustomer(personOne);
        freeBookStore.newRegisterCustomer(personTwo);


        freeBookStore.addNewBook("Programing in Java makes fun :)", "Rishu Chowdhary");


        // freeBookStore unRegister existing customers
        freeBookStore.unRegisterCustomer(uhsir);


        freeBookStore.addNewBook("Programing in Python makes fun :)", "Rishu Chowdhary");


        // Optional
        System.out.println();
        System.out.println();
        personOne.setBuyBooks(freeBookStore.buyNewBook()); // Person can buy new book
        System.out.println(personOne.getBoughtBooks()); // And print the bought books

    }
}