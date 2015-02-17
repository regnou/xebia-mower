package com.mowitnow.domain;

/**
 * Default {@link com.mowitnow.domain.Mower} implementation.
 */
public class LawnMower implements Mower {

    @Override
    public void move() {

    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public Orientation getOrientation() {
        return null;
    }
}
