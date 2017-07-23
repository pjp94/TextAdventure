package com.example.pramath.textadventure2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.pramath.textadventure2.MapData.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StoryboardActivity extends AppCompatActivity {

  @BindView(R.id.story_text_area) TextView storyTextArea;
  @BindView(R.id.input_field) TextView inputField;
  @BindView(R.id.button_submit) Button submitButton;

  private Map map;
  private Player player;
  private DataTransfer dataTransfer;
  private Storyboard storyboard;
  private InputHandler inputHandler;
  private ResponseBuilder responseBuilder;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_storyboard);
    ButterKnife.bind(this);

//    map = new Map(new Coordinate(5, 7));
//    player = new Player("poop", new Coordinate(3, 3));
//    dataTransfer = new DataTransfer(player, map);
//    storyboard = new Storyboard();
//    inputHandler = new InputHandler(dataTransfer); // TODO: Pass in Story class so it knows which story to handle
//    responseBuilder = new ResponseBuilder();
  }

  @OnClick(R.id.button_submit)
  protected void onClick() {
    String input = inputField.getText().toString().trim();

    if (!input.isEmpty()) {
      String storyText = storyTextArea.getText().toString();
      String response = inputHandler.parseInput(input);
      String fullResponse = responseBuilder.buildResponse(storyText, input, response);

      storyTextArea.setText(fullResponse);
      inputField.setText("");
    }
  }
}
