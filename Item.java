package com.example.pramath.textadventure2;

public class Item {

  private final String name;
  private final String description;

  Item(String name, String description) {
    this.name = name;
    this.description = description;
  }

  Item(String name) {
    this.name = name;
    this.description = "";
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }
}
