package com.example.groceryapplication;

public class Item {
    private String item, itemDescription;
    private int itemImage;

    public Item(String item, String itemDescription, int itemImage) {
        this.item = item;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }
}
