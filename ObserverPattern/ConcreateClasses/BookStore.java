package ObserverPattern.ConcreateClasses;

import ObserverPattern.Interface.Customers;

import java.util.ArrayList;

public class BookStore implements Customers {

    private String storeName;
    private String storeOwner;

    private ArrayList<CustomerClass>customerList = new ArrayList<>(); // all the customer who registered

    private ArrayList<BookDetails>bookList = new ArrayList<>(); // all the book available inside the book store
    public BookDetails newBookDetails; // hold the new book data

    public BookStore(String storeName, String storeOwner) {
        this.storeName = storeName;
        this.storeOwner = storeOwner;
    }

    public String getStoreName() {
        return storeName + " Owned by " + storeOwner;
    }

    public void setStoreDetails(String newName,String newOwner){
        this.storeName =  newName;
        this.storeOwner = newOwner;
    }

    public void addNewBook(String name, String author){
        if(name.length() > 0 && author.length() > 0){
            BookDetails newBook = new BookDetails(name,author);
            newBookDetails = newBook;
            System.out.println();
            System.out.println();
            System.out.println("+++++++ New Book Added +++++++");
            System.out.println("Book Name: " + newBookDetails.getBookName());
            System.out.println("Book Author: " + newBookDetails.getBookAuthor());
            System.out.println("++++++++++++++++++++++++++++++");


            // Notify all the Customer's if new book added inside the Store.
            notifyCustomers();

            bookList.add(newBook);// adding the book inside the all book list.
        }
    }


    public BookDetails buyNewBook() {
        return newBookDetails;
    }

    // register function for new customers
    @Override
    public void newRegisterCustomer(CustomerClass customer) {
        if(customer.getName().length() > 0){
            customerList.add(customer);
        }
        else{
            System.out.println("Please write your name.");
        }
    }

    // unRegister function for removing existing customers
    @Override
    public void unRegisterCustomer(CustomerClass customer) {
        customerList.remove(customer);
    }

    // use to release message for all the registered customers
    @Override
    public void notifyCustomers() {
        System.out.println("Notified All our Customer's" + "-> Total Customer: " + customerList.size());
        for (CustomerClass customers : customerList){
            customers.updateNewBooks();
        }
    }

}