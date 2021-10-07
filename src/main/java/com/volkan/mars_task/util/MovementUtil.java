package com.volkan.mars_task.util;

import com.volkan.mars_task.exception.CustomException;
import com.volkan.mars_task.model.Coordinate;
import com.volkan.mars_task.model.RoverPosition;

public final class MovementUtil {

    private MovementUtil() {

    }

    static RoverPosition moveForward(RoverPosition roverPosition, Coordinate boundaryCoordinate) {
        switch (roverPosition.getDirection()) {
            case NORTH:
                if (roverPosition.getYAxis() >= boundaryCoordinate.getYAxis())
                    throw new CustomException("You can't go North because of the border");
                roverPosition.setYAxis(roverPosition.getYAxis() + 1);
                break;
            case EAST:
                if (roverPosition.getXAxis() >= boundaryCoordinate.getXAxis())
                    throw new CustomException("You can't go East because of the border");
                roverPosition.setXAxis(roverPosition.getXAxis() + 1);
                break;
            case WEST:
                if (roverPosition.getXAxis() <= 0)
                    throw new CustomException("You can't go East because of the border");
                roverPosition.setXAxis(roverPosition.getXAxis() - 1);
                break;
            case SOUTH:
                if (roverPosition.getYAxis() <= 0)
                    throw new CustomException("You can't go West because of the border");
                roverPosition.setYAxis(roverPosition.getYAxis() - 1);
                break;
            default:

        }
        return roverPosition;
    }
}
