package com.example.pramath.textadventure2;

import com.example.pramath.textadventure2.MapData.Map;

class DataTransfer {

  private final Player player;
  private final Map map;

  DataTransfer(Player player, Map map) {
    this.player = player;
    this.map = map;
  }

  public Player getPlayer() {
    return player;
  }

  public Map getMap() {
    return map;
  }
}
