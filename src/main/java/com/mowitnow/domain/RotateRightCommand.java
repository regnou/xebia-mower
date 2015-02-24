package com.mowitnow.domain;

/**
 * Created by phnx on 2/24/15.
 */
public class RotateRightCommand implements Command {

    private final Mower mower;

    public RotateRightCommand(Mower mower) {
        this.mower = mower;
    }

    @Override
    public void execute() {
        mower.rotateRight();
    }
}
