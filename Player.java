package com.example.pramath.textadventure2;

class Player {

  private final String name;
  private Coordinate position;

  Player(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Coordinate getPosition() {
    return position;
  }

  private void setPosition(Coordinate coordinate) {
    int x = coordinate.getX();
    int y = coordinate.getY();

    this.position.setX(x);
    this.position.setY(y);
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

  public void move(Direction direction) {
    setPosition(updatedPosition(direction));
  }

  public Coordinate positionIfMoves(Direction direction) {
    return updatedPosition(direction);
  }

}
