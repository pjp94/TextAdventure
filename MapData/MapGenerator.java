package com.example.pramath.textadventure2.MapData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MapGenerator {

  private static ArrayList<ArrayList<MapElement>> map;

  public static Map generateMap(String filename) {
    String filePath = new File("").getAbsolutePath() + filename;
    map = new ArrayList<>();

    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

      try {
        String line;

        while ((line = bufferedReader.readLine()) != null) {
          char[] charArray = line.toUpperCase().toCharArray();
          ArrayList<MapElement> mapRow = new ArrayList<>();

          for (char element : charArray) {
            switch (element) {
              case 'X':
                mapRow.add(new Wall());
                break;
              case 'L':
                mapRow.add(new Door(true));
                break;
              case 'U':
                mapRow.add(new Door(false));
                break;
              case 'T':
                mapRow.add(new Table());
                break;
              default:
                mapRow.add(new Floor());
                break;
            }
          }

          map.add(mapRow);
        }
      } catch (IOException ex) {
        return new Map();
      } finally {
        try {
          bufferedReader.close();
        } catch (IOException ex) {
          ex.printStackTrace();
        }
      }
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
      return new Map();
    }

    return new Map(toArray());
  }

  private static MapElement[][] toArray() {
    int height = map.size();
    int width = map.get(0).size();

    MapElement[][] mapArray = new MapElement[height][width];

    for (int i = 0; i < height; i ++) {
      for (int j = 0; j < width; j++) {
        mapArray[i][j] = map.get(i).get(j);
      }
    }

    return mapArray;
  }
}
