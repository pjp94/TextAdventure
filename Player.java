package com.example.pramath.textadventure2;

import com.example.pramath.textadventure2.Enums.Direction;

class Player {

  private final String name;
  private Coordinate position;
  private Direction heading;

  Player(String name) {
    this.name = name;
    position = new Coordinate();
    heading = Direction.NORTH;
  }

  public String getName() {
    return name;
  }

  public Coordinate getPosition() {
    return position;
  }

  void setPosition(Coordinate coordinate) {
    int x = coordinate.getX();
    int y = coordinate.getY();

    this.position.setX(x);
    this.position.setY(y);
  }

  Direction getHeading() { return heading; }

  void setHeading(Direction heading) {
    this.heading = heading;
  }

  private Coordinate updatedPosition(Direction direction) {
    int x = position.getX();
    int y = position.getY();

    switch (direction) {
      case NORTH:
        y--;
        break;
      case SOUTH:
        y++;
        break;
      case EAST:
        x++;
        break;
      case WEST:
        x--;
        break;
    }

    return new Coordinate(x, y);
  }

  void move(Direction direction) {
    setPosition(updatedPosition(direction));
    setHeading(direction);
  }

  Coordinate positionIfMoves(Direction direction) {
    return updatedPosition(direction);
  }

}
