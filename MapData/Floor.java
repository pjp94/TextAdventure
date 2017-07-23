package com.example.pramath.textadventure2.MapData;

import com.example.pramath.textadventure2.Item;

public class Floor extends MapElement {

  private Item item;

  public Floor() {
    item = null;
  }

  public Floor(Item item) {
    this.item = item;
  }

  public boolean removeItem(String name) {
    boolean wasRemoved = false;

    if (this.item != null && this.item.getName().equals(name)) {
      item = null;
      wasRemoved = true;
    }

    return wasRemoved;
  }

  public boolean addItem(Item item) {
    boolean wasAdded = false;

    if (this.item == null) {
      this.item = item;
      wasAdded = true;
    }

    return wasAdded;
  }
}
