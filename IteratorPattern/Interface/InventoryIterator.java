package IteratorPattern.Interface;

public interface InventoryIterator {

    boolean hasNext();

    void next();

    Object currentItem();
}
