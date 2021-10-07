package com.volkan.mars_task.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DirectionTest {

    @Test
    void valueOfLabel() {

        Assertions.assertEquals("N", Direction.NORTH.getLabel());
        Assertions.assertEquals("S", Direction.SOUTH.getLabel());
        Assertions.assertEquals("W", Direction.WEST.getLabel());
        Assertions.assertEquals("E", Direction.EAST.getLabel());
    }

    @Test
    void getRightRotation() {
        Assertions.assertEquals(Direction.EAST, Direction.NORTH.getRightRotation());
        Assertions.assertEquals(Direction.SOUTH, Direction.EAST.getRightRotation());
        Assertions.assertEquals(Direction.NORTH, Direction.WEST.getRightRotation());
        Assertions.assertEquals(Direction.WEST, Direction.SOUTH.getRightRotation());
    }

    @Test
    void getLeftRotation() {

        Assertions.assertEquals(Direction.WEST, Direction.NORTH.getLeftRotation());
        Assertions.assertEquals(Direction.NORTH, Direction.EAST.getLeftRotation());
        Assertions.assertEquals(Direction.SOUTH, Direction.WEST.getLeftRotation());
        Assertions.assertEquals(Direction.EAST, Direction.SOUTH.getLeftRotation());
    }
}