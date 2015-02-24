package com.mowitnow.domain.commands;

import com.mowitnow.domain.lawn.Lawn;
import com.mowitnow.domain.mower.Mower;

/**
 * {@link com.mowitnow.domain.commands.Command} for moving the mower (i.e receiver object) forward onto the given {@link com.mowitnow.domain.lawn.Lawn}.
 */
public class MoveCommand implements Command {

    private final Mower mower;

    public MoveCommand(Mower mower, Lawn lawn) {
        this.mower = mower;
    }

    @Override
    public void execute() {
        mower.move();
    }
}
