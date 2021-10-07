package com.volkan.mars_task.model;

import com.volkan.mars_task.exception.CustomException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum Movement {
    LEFT_ROTATE("L"), RIGHT_ROTATE("R"),MOVE_FORWARD("M");

    private String value;

    Movement(String value) {
        this.value = value;
    }


    private static final Map<String, Movement> BY_VALUE = new HashMap<>();

    static {
        Arrays.stream(values()).forEach(element -> BY_VALUE.put(element.value, element) );
    }


    public static Movement valueOfLabel(String value)  {
        if(BY_VALUE.get(value) == null )
            throw new CustomException("You can ONLY enter L or R or M letters") ;
        return BY_VALUE.get(value);
    }
}