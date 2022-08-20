package ObserverPattern.ConcreateClasses;

import ObserverPattern.Interface.Customer;

import java.util.ArrayList;

public class CustomerClass implements Customer {

    private String name;
    private ArrayList<BookDetails>boughtBooks = new ArrayList<>();

    private BookStore bookStore; // reference to book store


    public BookStore getBookStore() {
        return bookStore;
    }

    public void setBookStore(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerClass(String name) {
        this.name = name;
    }


    public ArrayList<String> getBoughtBooks() {
        ArrayList<String> returningData = new ArrayList<>();
        for(BookDetails book : boughtBooks){
            returningData.add("Book Name: " + book.getBookName() + "-> Author: " + book.getBookAuthor());
        }
        return returningData;
    }

    public void setBuyBooks(BookDetails boughtBooks) {
        BookDetails newBookAdd = new BookDetails(boughtBooks.getBookName(),boughtBooks.getBookAuthor());
        this.boughtBooks.add(newBookAdd);
    }


    // Call automatically if new book added inside the store
    @Override
    public void updateNewBooks() {
        System.out.println("Hey " + getName() + " new book \"" + getBookStore().newBookDetails.getBookName() + "\" by "+ getBookStore().newBookDetails.getBookAuthor() + " has arrived!");
    }
}
