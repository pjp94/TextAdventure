package com.example.pramath.textadventure2.MapData;

import com.example.pramath.textadventure2.Coordinate;

public class Map {

  // Origin is top left corner
  private final Coordinate bounds;
  private final MapElement[][] map;

  public Map() {
    this.bounds = new Coordinate();
    map = new MapElement[0][0];
  }

  Map(MapElement[][] mapArray) {
    this.bounds = new Coordinate(mapArray[0].length, mapArray.length);
    map = mapArray;
  }

  public boolean isValidSpotToMoveTo(Coordinate position) {
    int x = position.getX();
    int y = position.getY();
    MapElement cell = map[x][y];

    return cell instanceof Floor || (cell instanceof Door && !((Door) cell).isLocked());
  }

  public String toPlainText() {
    int height = bounds.getY();
    int width = bounds.getX();

    StringBuilder mapString = new StringBuilder();

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        MapElement element = map[i][j];

        if (element instanceof Wall) {
          mapString.append('X');
        } else if (element instanceof Door) {
          mapString.append(((Door)element).isLocked() ? 'L' : 'U');
        } else if (element instanceof Table) {
          mapString.append('T');
        } else {
          mapString.append(' ');
        }
      }
    }

    return mapString.toString();
  }
}
