package IteratorPattern.Concreate;

import IteratorPattern.Interface.Inventory;
import IteratorPattern.Interface.InventoryIterator;

import java.util.ArrayList;

public class ItemInventory <Item> implements Inventory {

    ArrayList<Item> itemsBag = new ArrayList<>();

    public void addNewItem(Item item){
        this.itemsBag.add(item);
    }

    @Override
    public InventoryIterator getIterator() {
        return new ItemIterator(this);
    }



    //::::::::::::::::::::: Below Iterator is only accessible by above collection :::::::::::::::::::::::::::::::::>
    private class ItemIterator implements InventoryIterator{

        ItemInventory itemInventory;
        int index = 0;

        public ItemIterator(ItemInventory itemInventory) {
            this.itemInventory = itemInventory;
        }

        @Override
        public boolean hasNext() {
            return index < this.itemInventory.itemsBag.size();
        }

        @Override
        public void next() {
            this.index++;
        }

        @Override
        public Object currentItem() {
            return this.itemInventory.itemsBag.get(index);
        }
    }
}
