package com.example.pramath.textadventure2.MapData;

class Door extends MapElement {

  private boolean isLocked;

  Door(boolean isLocked) {
    this.isLocked = isLocked;
  }

  boolean isLocked() {
    return isLocked;
  }

  void setLocked(boolean isLocked) {
    this.isLocked = isLocked;
  }
}
