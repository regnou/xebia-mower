package com.mowitnow.domain;

/**
 * Default {@link com.mowitnow.domain.Mower} implementation.
 */
public class LawnMower implements Mower {

    private int x;
    private int y;
    private Orientation orientation = Orientation.NORTH;

    public LawnMower(int x, int y, Orientation orientation) {
    }

    @Override
    public void move() {
        y++;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public Orientation getOrientation() {
        return orientation;
    }
}
