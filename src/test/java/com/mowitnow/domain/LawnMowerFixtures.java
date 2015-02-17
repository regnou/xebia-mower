package com.mowitnow.domain;

/**
 * {@link com.mowitnow.domain.LawnMower} Fixtures
 */
public class LawnMowerFixtures {

    /**
     * Create a LawnMower at position [0, 0] facing North and return it
     *
     * @return a new {@link com.mowitnow.domain.LawnMower}
     */
    public static LawnMower newLawnMowerAtDefaultInitialPositionFacingNorth() {
        return newLawnMowerAtGivenPositionFacingGivenOrientation(0, 0, Orientation.NORTH);
    }

    /**
     * Create a LawnMower at position [1, 1] facing South and return it
     *
     * @return a new {@link com.mowitnow.domain.LawnMower}
     */
    public static LawnMower newLawnMowerAtCenterPositionFacingSouth() {
        return newLawnMowerAtCenterPositionFacingGivenOrientation(Orientation.SOUTH);
    }

    private static LawnMower newLawnMowerAtCenterPositionFacingGivenOrientation(Orientation orientation) {
        return newLawnMowerAtGivenPositionFacingGivenOrientation(1, 1, orientation);
    }

    private static LawnMower newLawnMowerAtGivenPositionFacingGivenOrientation(int x, int y, Orientation orientation) {
        return new LawnMower(x, y, orientation);
    }
}
