package com.example.pramath.textadventure2;

import android.app.Instrumentation;
import android.content.Context;
import android.test.InstrumentationTestCase;
import android.test.mock.MockContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class InputParserTests {

  private static final String[] VERBS_GO_ARRAY = new String[]
          {
                  "advance", "go", "move", "proceed", "progress", "run", "travel", "walk"
          };
  private static final HashSet<String> VERBS_GO = new HashSet<String>(Arrays.asList(VERBS_GO_ARRAY));

  @Mock
  Context mockContext;

  @Test
  public void testVerbType() {
    when(mockContext.getResources().getStringArray(R.array.verb_go))
            .thenReturn(VERBS_GO_ARRAY);

    InputHandler inputHandler = new InputHandler(new MockDataTransfer(), mockContext);
    String command = "go";

    Verb verb = inputHandler.getVerbType(command);

    assertEquals(Verb.GO, verb);
  }
}
