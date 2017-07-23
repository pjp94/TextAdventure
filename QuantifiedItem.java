package com.example.pramath.textadventure2;

public class QuantifiedItem extends Item {

  private int amount;

  public QuantifiedItem(String name, String description, int amount) {
    super(name, description);
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
