package ObserverPattern.Interface;

import ObserverPattern.ConcreateClasses.CustomerClass;

public interface Customers {

    // register new Customer for notification
    public void newRegisterCustomer(CustomerClass customer);

    // unRegister existing Customer for notification
    public void unRegisterCustomer(CustomerClass customer);

    // notified all existing customer's
    public void notifyCustomers();
}
