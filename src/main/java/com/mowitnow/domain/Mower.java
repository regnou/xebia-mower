package com.mowitnow.domain;

/**
 * This class represents a programmable and automated mower with the ability to mow any rectangular surface.
 */
public interface Mower {

    /**
     * Move this mower one position forward from its current position
     */
    public void move();

    public int getX();
    public int getY();
    public Orientation getOrientation();
}
