package com.example.pramath.textadventure2;

import android.content.Context;

import com.example.pramath.textadventure2.Enums.Direction;
import com.example.pramath.textadventure2.Enums.Verb;

import java.util.Arrays;
import java.util.HashSet;

class Thesaurus {

  private Context context;

  private final HashSet<String> VERB_GO;
  private final HashSet<String> VERB_TAKE;
  private final HashSet<String> VERB_DROP;

  private final HashSet<String> DIRECTION_NORTH;
  private final HashSet<String> DIRECTION_SOUTH;
  private final HashSet<String> DIRECTION_EAST;
  private final HashSet<String> DIRECTION_WEST;
  private final HashSet<String> DIRECTION_STRAIGHT;
  private final HashSet<String> DIRECTION_BACK;

  Thesaurus(Context context) {
    this.context = context;

    VERB_GO = new HashSet<>(Arrays.asList(context.getResources().getStringArray(R.array.verb_go)));
    VERB_TAKE = new HashSet<>(Arrays.asList(context.getResources().getStringArray(R.array.verb_take)));
    VERB_DROP = new HashSet<>(Arrays.asList(context.getResources().getStringArray(R.array.verb_drop)));

    DIRECTION_NORTH = new HashSet<>(Arrays.asList(context.getResources().getStringArray(R.array.direction_north)));
    DIRECTION_SOUTH = new HashSet<>(Arrays.asList(context.getResources().getStringArray(R.array.direction_south)));
    DIRECTION_EAST = new HashSet<>(Arrays.asList(context.getResources().getStringArray(R.array.direction_east)));
    DIRECTION_WEST = new HashSet<>(Arrays.asList(context.getResources().getStringArray(R.array.direction_west)));
    DIRECTION_STRAIGHT = new HashSet<>(Arrays.asList(context.getResources().getStringArray(R.array.direction_straight)));
    DIRECTION_BACK = new HashSet<>(Arrays.asList(context.getResources().getStringArray(R.array.direction_back)));
  }

  Thesaurus(Context context, HashSet<String> verbGo, HashSet<String> verbTake,
            HashSet<String> verbDrop, HashSet<String> directionNorth,
            HashSet<String> directionSouth, HashSet<String> directionEast,
            HashSet<String> directionWest, HashSet<String> directionStraight,
            HashSet<String> directionBack) {
    this.context = context;

    VERB_GO = verbGo;
    VERB_TAKE = verbTake;
    VERB_DROP = verbDrop;

    DIRECTION_NORTH = directionNorth;
    DIRECTION_SOUTH = directionSouth;
    DIRECTION_EAST = directionEast;
    DIRECTION_WEST = directionWest;
    DIRECTION_STRAIGHT = directionStraight;
    DIRECTION_BACK = directionBack;
  }

  Verb getVerb(String word) {
    Verb verb;

    if (VERB_GO.contains(word)) {
      verb = Verb.GO;
    } else if (VERB_TAKE.contains(word)) {
      verb = Verb.TAKE;
    } else if (VERB_DROP.contains(word)) {
      verb = Verb.DROP;
    } else {
      verb = Verb.INVALID;
    }

    return verb;
  }

  Direction getDirection(String word, Direction currentHeading) {
    Direction direction;

    if (DIRECTION_NORTH.contains(word)) {
      direction = Direction.NORTH;
    } else if (DIRECTION_SOUTH.contains(word)) {
      direction = Direction.SOUTH;
    } else if (DIRECTION_EAST.contains(word)) {
      direction = Direction.EAST;
    } else if (DIRECTION_WEST.contains(word)) {
      direction = Direction.WEST;
    } else if (DIRECTION_STRAIGHT.contains(word)) {
      direction = currentHeading;
    } else if (DIRECTION_BACK.contains(word)) {
      direction = currentHeading.getOpposite();
    } else {
      direction = Direction.INVALID;
    }

    return direction;
  }
}
