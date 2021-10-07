package com.volkan.mars_task.model;

import com.volkan.mars_task.exception.CustomException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum Direction {
    NORTH("N", "E", "W"),
    SOUTH("S", "W", "E"),
    WEST("W", "N", "S"),
    EAST("E", "S", "N");



    private String label;

    private String rightRotation;

    private String leftRotation;

    Direction(String label, String rightRotation, String leftRotation) {
        this.label = label;
        this.rightRotation = rightRotation;
        this.leftRotation = leftRotation;
    }


    private static final Map<String, Direction> BY_LABEL = new HashMap<>();

    static {
        Arrays.stream(values()).forEach(element -> BY_LABEL.put(element.label, element));
    }


    public static Direction valueOfLabel(String label) {
        if(BY_LABEL.get(label) == null )
            throw new CustomException("You can ONLY enter N or S or W or E letters") ;
        return BY_LABEL.get(label);

    }

    public Direction getRightRotation() {
        return valueOfLabel(rightRotation);
    }

    public Direction getLeftRotation() {

        return valueOfLabel(leftRotation);
    }
    public String getLabel() {
        return label;
    }

}