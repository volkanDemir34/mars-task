package com.volkan.mars_task.util;

import com.volkan.mars_task.exception.CustomException;
import com.volkan.mars_task.model.Coordinate;
import com.volkan.mars_task.model.RoverPosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MovementUtilTest {

    @Test
    void moveForward() {
        Coordinate boundaryCoordinate = new Coordinate(5, 5);
        RoverPosition roverPosition = new RoverPosition(1, 2, "N");
        MovementUtil.moveForward(roverPosition, boundaryCoordinate);
        Assertions.assertEquals(3, roverPosition.getYAxis());
        MovementUtil.moveForward(roverPosition, boundaryCoordinate);
        Assertions.assertEquals(4, roverPosition.getYAxis());
        MovementUtil.moveForward(roverPosition, boundaryCoordinate);
        Assertions.assertEquals(5, roverPosition.getYAxis());
    }

    @Test
    void moveForwardThrowException() {
        Coordinate boundaryCoordinate = new Coordinate(1, 2);
        RoverPosition roverPosition = new RoverPosition(1, 2, "N");
        Assertions.assertThrows(CustomException.class, () -> MovementUtil.moveForward(roverPosition, boundaryCoordinate));

    }
}