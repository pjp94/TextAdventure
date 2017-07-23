package com.example.pramath.textadventure2;

import android.content.Context;
import android.content.res.Resources;

import com.example.pramath.textadventure2.MapData.Map;

import java.util.Arrays;
import java.util.HashSet;

class InputHandler {

  private DataTransfer dataTransfer;
  private Context context;

  // TODO: Specify Story and Scene objects so it knows which story and scene to parse input for
  // final Story story;
  // Scene scene

  private final HashSet<String> VERB_SET_GO;
  private final HashSet<String> VERB_SET_TAKE;
  private final HashSet<String> VERB_SET_DROP;


  InputHandler(DataTransfer dataTransfer, Context context) {
//   this.story = story;
//   scene = Scene.INTRO;
    this.dataTransfer = dataTransfer;
    this.context = context;

    VERB_SET_GO = new HashSet<>(Arrays.asList(context.getResources().getStringArray(R.array.verb_go)));
    VERB_SET_TAKE = new HashSet<>(Arrays.asList(context.getResources().getStringArray(R.array.verb_take)));
    VERB_SET_DROP = new HashSet<>(Arrays.asList(context.getResources().getStringArray(R.array.verb_drop)));
  }

  private boolean includesWord(String input) {
    return false;
  }

  String parseInput(String input) {
    String[] words = input.toLowerCase().split("\\s+");
    String response;

    if (words.length > 0) {
      String verb = words[0];
      Verb verbType = getVerbType(verb);

      switch (verbType) {
        case GO:

          break;
      }
    }

    return "";
  }

//  public String handleInput(String input) {
//    String[] words = input.split("\\s+");
//    String response;
//
//    if (words.length > 1) {
//      String verb = words[0].toLowerCase();
//      Player player = dataTransfer.getPlayer();
//      Map map = dataTransfer.getMap();
//
//      switch (verb) {
//        case "go":
//          String direction = words[1].toLowerCase();
//
//          switch (direction) {
//            case "north":
//            case "forward":
//            case "up":
//              if (map.isValidSpotToMoveTo(player.positionIfMoves(Direction.NORTH))) {
//                player.move(Direction.NORTH);
//                response = "You go " + direction + ".";
//              } else {
//                response = context.getString(R.string.invalid_move);
//              }
//              break;
//            case "south":
//            case "backwards":
//            case "down":
//              if (map.isValidSpotToMoveTo(player.positionIfMoves(Direction.SOUTH))) {
//                player.move(Direction.SOUTH);
//                response = "You go " + direction + ".";
//              } else {
//                response = context.getString(R.string.invalid_move);
//              }
//              break;
//            case "east":
//            case "right":
//              if (map.isValidSpotToMoveTo(player.positionIfMoves(Direction.EAST))) {
//                player.move(Direction.EAST);
//                response = "You go " + direction + ".";
//              } else {
//                response = context.getString(R.string.invalid_move);
//              }
//              break;
//            case "west":
//            case "left":
//              if (map.isValidSpotToMoveTo(player.positionIfMoves(Direction.WEST))) {
//                player.move(Direction.WEST);
//                response = "You go " + direction + ".";
//              } else {
//                response = context.getString(R.string.invalid_move);
//              }
//              break;
//            default:
//              response = context.getString(R.string.invalid_action);
//          }
//          break;
//        default:
//          response = context.getString(R.string.invalid_action);
//      }
//    } else {
//      response = context.getString(R.string.invalid_action);
//    }
//
//    return response;
//  }

  Verb getVerbType(String word) {
    Verb verbType;

    if (VERB_SET_GO.contains(word)) {
      verbType = Verb.GO;
    } else if (VERB_SET_TAKE.contains(word)) {
      verbType = Verb.TAKE;
    } else if (VERB_SET_DROP.contains(word)) {
      verbType = Verb.DROP;
    } else {
      verbType = Verb.INVALID;
    }

    return verbType;
  }
}
