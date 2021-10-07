package com.volkan.mars_task.util;

import com.volkan.mars_task.model.Coordinate;
import com.volkan.mars_task.model.Movement;
import com.volkan.mars_task.model.RoverPosition;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class RoverPositionUtil {

    private RoverPositionUtil(){

    }


    public static RoverPosition calculateLastRoverPosition(String moves, RoverPosition roverPosition, Coordinate
            boundaryCoordinate) {
        List<Movement> movementList = Arrays.asList(moves.split("")).stream().map(Movement::valueOfLabel).collect(Collectors.toList());
        movementList.forEach(movement -> {
            switch (movement) {
                case LEFT_ROTATE:
                    roverPosition.setDirection(roverPosition.getDirection().getLeftRotation());
                    break;
                case RIGHT_ROTATE:
                    roverPosition.setDirection(roverPosition.getDirection().getRightRotation());
                    break;
                case MOVE_FORWARD:
                    MovementUtil.moveForward(roverPosition, boundaryCoordinate);
                    break;
                default:
            }
        });
        return roverPosition;
    }

}
