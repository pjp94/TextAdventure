package com.example.pramath.textadventure2.Enums;

public enum Direction {
  NORTH,
  SOUTH,
  EAST,
  WEST,
  INVALID;

  public String getName() {
    return this.toString().toLowerCase();
  }

  public Direction getOpposite() {
    Direction direction;

    switch (this) {
      case NORTH:
        direction = SOUTH;
        break;
      case SOUTH:
        direction = NORTH;
        break;
      case EAST:
        direction = WEST;
        break;
      case WEST:
        direction = EAST;
        break;
      default:
        direction = INVALID;
        break;
    }

    return direction;
  }
}
