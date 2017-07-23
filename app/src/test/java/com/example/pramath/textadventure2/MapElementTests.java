package com.example.pramath.textadventure2;


import com.example.pramath.textadventure2.MapData.Floor;
import com.example.pramath.textadventure2.MapData.Table;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MapElementTests {

  @Test
  public void testTableRemoveAndAddItem() {
    ArrayList<Item> items = new ArrayList<>();

    items.add(new Item("ball"));
    items.add(new Item("string"));
    items.add(new Item("knife"));
    items.add(new Item("paper"));

    Table table = new Table(10, items);

    assertTrue(table.removeItem("ball"));
    assertFalse(table.removeItem("bat"));
    assertTrue(table.addItem(new Item("bat")));
    assertTrue(table.removeItem("bat"));
  }

  @Test
  public void testFullTable() {
    ArrayList<Item> items = new ArrayList<>();

    items.add(new Item("ball"));
    items.add(new Item("knife"));
    items.add(new Item("apple"));

    Table table = new Table(3, items);

    assertFalse(table.addItem(new Item("cup")));
    assertTrue(table.removeItem("knife"));
    assertTrue(table.addItem(new Item("cup")));
    assertTrue(table.removeItem("cup"));
  }

  @Test
  public void testFloor() {
    Floor floor = new Floor();

    assertFalse(floor.removeItem("ball"));
    assertTrue(floor.addItem(new Item("box")));
    assertFalse(floor.addItem(new Item("knife")));
    assertTrue(floor.removeItem("box"));
  }
}
