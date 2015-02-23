package com.mowitnow.domain;

import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;

/**
 * {@link com.mowitnow.domain.MoveCommand} unit testing.
 */
@Test
public class MoveCommandTests {

    public void Given_MoveCommand_When_Execute_Then_VerifyThatTheMowerMoved() {
        Mower lawnMower = mock(LawnMower.class);
        MoveCommand moveCommand = new MoveCommand(lawnMower);

        moveCommand.execute();

        Mockito.verify(lawnMower).move();
    }
}
