package com.mowitnow.domain;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * {@link com.mowitnow.domain.LawnMower} unit testing.
 */
@Test
public class LawnMowerTests {

    public void Given_MowerFacingNorth_When_ToldToMove_Then_StopOnAdjacentUpperPositionFacingNorth() {
        LawnMower lawnMower = LawnMowerFixtures.newLawnMowerAtDefaultInitialPositionFacingNorth();

        lawnMower.move();

        assertEquals(lawnMower.getX(), 0);
        assertEquals(lawnMower.getY(), 1);
        assertEquals(lawnMower.getOrientation(), Orientation.NORTH);
    }

    public void Given_MowerFacingSouth_When_ToldToMove_Then_StopOnAdjacentLowerPositionFacingSouth() {
        LawnMower lawnMower = LawnMowerFixtures.newLawnMowerAtCenterPositionFacingSouth();

        lawnMower.move();

        assertEquals(lawnMower.getX(), 1);
        assertEquals(lawnMower.getY(), 0);
        assertEquals(lawnMower.getOrientation(), Orientation.SOUTH);
    }
}
