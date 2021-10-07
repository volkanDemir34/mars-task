package com.volkan.mars_task.util;

import com.volkan.mars_task.model.Coordinate;
import com.volkan.mars_task.model.RoverPosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverPositionUtilTest {


    @Test
    void calculateLastRoverPosition_FirstCase() {
        Coordinate boundaryCoordinate = new Coordinate(5, 5);
        RoverPosition roverPosition = new RoverPosition(1, 2, "N");
        RoverPosition expectedResult = new RoverPosition(1, 3, "N");
        RoverPosition actualResult =
                RoverPositionUtil.calculateLastRoverPosition("LMLMLMLMM", roverPosition, boundaryCoordinate);
        Assertions.assertEquals(expectedResult.getXAxis(),
                actualResult.getXAxis());
        Assertions.assertEquals(expectedResult.getYAxis(),
                actualResult.getYAxis());
        Assertions.assertEquals(expectedResult.getDirection(),
                actualResult.getDirection());
    }


    @Test
    void calculateLastRoverPosition_SecondCase() {
        Coordinate boundaryCoordinate = new Coordinate(5, 5);
        RoverPosition roverPosition = new RoverPosition(3, 3, "E");
        RoverPosition expectedResult = new RoverPosition(5, 1, "E");
        RoverPosition actualResult =
                RoverPositionUtil.calculateLastRoverPosition("MMRMMRMRRM", roverPosition, boundaryCoordinate);
        Assertions.assertEquals(expectedResult.getXAxis(),
                actualResult.getXAxis());
        Assertions.assertEquals(expectedResult.getYAxis(),
                actualResult.getYAxis());
        Assertions.assertEquals(expectedResult.getDirection(),
                actualResult.getDirection());
    }
}

