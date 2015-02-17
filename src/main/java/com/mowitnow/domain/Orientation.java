package com.mowitnow.domain;

/**
 * This class identifies the 4 cardinal points as usually found in any orientation system.<br/>
 * It can be used to represent the orientation of any {@link com.mowitnow.domain.Mower} object.
 */
public enum Orientation {

    NORTH,
    SOUTH,
    EAST,
    WEST;

    private Orientation leftOrientation;

    static {
        NORTH.leftOrientation = WEST;
        SOUTH.leftOrientation = EAST;
        EAST.leftOrientation = NORTH;
        WEST.leftOrientation = SOUTH;
    }

    /**
     * Return the orientation 90 degrees left from this orientation
     *
     * @return an {@link com.mowitnow.domain.Orientation}
     */
    public Orientation getLeftOrientation() {
        return leftOrientation;
    }
}
