package com.example.pramath.textadventure2;

class ResponseBuilder {

  String buildResponse(String storyText, String input, String response) {
    return (storyText + "\n\n") +
            ">> " + input + "\n\n" +
            response;
  }
}
