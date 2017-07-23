package com.example.pramath.textadventure2.MapData;

import com.example.pramath.textadventure2.Item;

import java.util.ArrayList;

public class Table extends MapElement {

  private final int MAX_CAPACITY;
  private ArrayList<Item> items;
  private ArrayList<String> itemNames = new ArrayList<>();

  public Table(int maxCapacity, ArrayList<Item> items) {
    MAX_CAPACITY = maxCapacity;
    this.items = items;

    for (Item item : items) {
      itemNames.add(item.getName());
    }
  }

  public Table(int maxCapacity) {
    MAX_CAPACITY = maxCapacity;
    items = new ArrayList<>();
  }

  Table() {
    MAX_CAPACITY = 3;
    items = new ArrayList<>();
  }

  public ArrayList<Item> getItems() {
    return items;
  }

  public boolean isFull() {
    return items.size() == MAX_CAPACITY;
  }

  public int getCurrentCapacity() {
    return items.size();
  }

  public boolean removeItem(String name) {
    boolean wasRemoved = false;
    int index;

    if ((index = itemNames.indexOf(name)) != -1) {
      items.remove(index);
      itemNames.remove(index);
      wasRemoved = true;
    }

    return wasRemoved;
  }

  public boolean addItem(Item item) {
    boolean wasAdded = false;

    if (items.size() < MAX_CAPACITY) {
      items.add(item);
      itemNames.add(item.getName());
      wasAdded = true;
    }

    return wasAdded;
  }
}
