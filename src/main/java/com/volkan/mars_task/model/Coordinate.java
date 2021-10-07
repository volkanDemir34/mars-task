package com.volkan.mars_task.model;

import com.volkan.mars_task.exception.CustomException;

public class Coordinate {

    protected int xAxis;

    protected int yAxis;

    public Coordinate(int xAxis, int yAxis) {
        if(xAxis<=0 || yAxis <0){
            throw new CustomException("Axis must be greater than Zero");
        }

        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public int getXAxis() {
        return xAxis;
    }

    public void setXAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public int getYAxis() {
        return yAxis;
    }

    public void setYAxis(int yAxis) {
        this.yAxis = yAxis;
    }
}
