package com.example.pramath.textadventure2;

import android.content.Context;

import com.example.pramath.textadventure2.Enums.Direction;
import com.example.pramath.textadventure2.Enums.Verb;
import com.example.pramath.textadventure2.MapData.Map;

class InputHandler {

  private DataTransfer dataTransfer;
  private Context context;

  // TODO: Specify Story and Scene objects so it knows which story and scene to parse input for
  // final Story story;
  // Scene scene

  private Thesaurus thesaurus;

  InputHandler(DataTransfer dataTransfer, Context context) {
//   this.story = story;
//   scene = Scene.INTRO;
    this.dataTransfer = dataTransfer;
    this.context = context;
    thesaurus = new Thesaurus(context);
  }

  InputHandler(DataTransfer dataTransfer, Thesaurus thesaurus, Context context) {

    this.dataTransfer = dataTransfer;
    this.thesaurus = thesaurus;
    this.context = context;
  }

  private boolean includesWord(String input) {
    return false;
  }

  String parseInput(String input) {
    Player player = dataTransfer.getPlayer();
    Map map = dataTransfer.getMap();

    String[] words = input.toLowerCase().split("\\s+");
    String response = "";

    if (words.length == 0) {
      return response;
    }

    String verb = words[0];
    Verb verbType = thesaurus.getVerb(verb);

    switch (verbType) {
      case GO:
        String directionWord = words[1];
        Direction direction = thesaurus.getDirection(directionWord, player.getHeading());

        if (map.isValidSpotToMoveTo(player.positionIfMoves(direction))) {
          player.move(direction);
          response = String.format(context.getString(R.string.move_success), verb, direction.getName());
        } else {
          response = context.getString(R.string.invalid_move);
        }
        break;
      default:
    }

    return response;
  }
}
