//package com.example.pramath.textadventure2;
//
//import java.util.HashMap;
//
//public class Backpack extends HashMap<Item, Integer> {
//
//  private static final int MAX_ITEMS = 10;
//  private int currentCount;
//
//  public boolean hasSpace() {
//    return currentCount < MAX_ITEMS;
//  }
//
//  private Item getItem(String name) {
//    Item[] items = (Item[])this.keySet().toArray();
//    int length = items.length;
//
//    for (int i = 0; i < length; i++) {
//      Item currentItem = items[i];
//
//      if (currentItem.getName().equals(name)) {
//        return currentItem;
//      }
//    }
//
//    return null;
//  }
//
//  private boolean containsItem(String name) {
//    Item[] items = (Item[])this.keySet().toArray();
//    int length = items.length;
//
//    for (int i = 0; i < length; i++) {
//      if (items[i].getName().equals(name)) {
//        return true;
//      }
//    }
//
//    return false;
//  }
//
//  private void subtractQuantity(Item item) {
//    Item itemInInventory = getItem(item.getName());
//    int currentQuantity = this.get(itemInInventory);
//    int quantityToSubtract = item.getQuantity();
//
//    itemInInventory.setQuantity(currentQuantity - quantityToSubtract);
//    currentCount -= quantityToSubtract;
//  }
//
//  private void addQuantity(Item item) {
//    Item itemInInventory = getItem(item.getName());
//    int currentQuantity = itemInInventory.getQuantity();
//    int quantityToAdd = item.getQuantity();
//
//    itemInInventory.setQuantity(currentQuantity + quantityToAdd);
//    currentCount += quantityToAdd;
//  }
//
//  public void pickUp(Item item) {
//    if (!this.containsItem(item)) {
//      this.add(item);
//    }
//
//    addQuantity(item);
//  }
//
//  public void discard(Item item) {
//    this.remove(item);
//    subtractQuantity(item);
//  }
//
//  public String examine() {
//    int size = this.size();
//    StringBuilder currentInventory = new StringBuilder();
//
//    currentInventory.append("You look through your backpack. You find ");
//    for (int i = 0; i < size; i++) {
//      Item item = this.get(i);
//      String itemName = item.getName();
//      int itemQuantity = item.getQuantity();
//      boolean isLastItem = i < size - 1;
//
//      if (!isLastItem) {
//        currentInventory.append("and ");
//      } else {
//
//      }
//    }
//  }
//}
