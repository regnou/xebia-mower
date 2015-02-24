package com.mowitnow.domain.commands;

import com.mowitnow.domain.mower.Mower;

/**
 * {@link com.mowitnow.domain.commands.Command} for moving the mower (i.e receiver object) forward.
 */
public class MoveCommand implements Command {

    private final Mower mower;

    public MoveCommand(Mower mower) {
        this.mower = mower;
    }

    @Override
    public void execute() {
        mower.move();
    }
}
