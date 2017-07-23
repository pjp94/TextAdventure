package com.example.pramath.textadventure2;

import com.example.pramath.textadventure2.MapData.Map;
import com.example.pramath.textadventure2.MapData.MapGenerator;

import org.junit.Test;
import static org.junit.Assert.*;

public class MapGeneratorTests {

  @Test
  public void testMapGenerationA() {
    Map map = MapGenerator.generateMap(
            "\\app\\src\\main\\java\\com\\example\\pramath\\textadventure2\\MapData\\MapTextFiles\\Map1.txt");
    String mapToString = map.toPlainText();
    String plainTextMap =
            "XXXXXXXXXX\n" +
            "X X      X\n" +
            "X X    T X\n" +
            "XLX    XXX\n" +
            "X        X\n" +
            "X        X\n" +
            "XXXXXUXXXX";

    assertEquals(mapToString, toSingleLine(plainTextMap));
  }

  private String toSingleLine(String mapText) {
    return mapText.replace("\n", "");
  }
}
