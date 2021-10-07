package com.volkan.mars_task.model;


public class RoverPosition extends Coordinate {

    private Direction direction;

    public RoverPosition(int xAxis, int yAxis, String direction) {
        super(xAxis, yAxis);
        this.direction = Direction.valueOfLabel(direction);
    }


    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }


    @Override
    public String toString() {
        return xAxis + " " + yAxis + " " + direction.getLabel();
    }



}
