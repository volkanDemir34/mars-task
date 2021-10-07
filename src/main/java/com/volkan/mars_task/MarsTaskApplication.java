package com.volkan.mars_task;


import com.volkan.mars_task.model.Coordinate;
import com.volkan.mars_task.model.RoverPosition;
import com.volkan.mars_task.util.RoverPositionUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MarsTaskApplication {
    static Coordinate boundaryCoordinate = null;
    static RoverPosition roverPosition = null;
    static List<RoverPosition> roverPositionList = new ArrayList();

    public static void main(String[] args) {
        readDirectivesAndCreateRovers();
    }

    static void readDirectivesAndCreateRovers() {

        System.out.println("When you finish to enter all data for rovers, press Enter key twice");
        try (InputStreamReader inputStream = new InputStreamReader(System.in);
             BufferedReader buffer = new BufferedReader(inputStream)) {

            int counter = 0;
            String line;
            while (!(line = buffer.readLine()).equals("")) {

                if (counter == 0) {
                    String[] coordinate = line.split("\\s+");
                    boundaryCoordinate = new Coordinate(Integer.valueOf(coordinate[0]), Integer.valueOf(coordinate[1]));

                } else if (counter % 2 == 1) {
                    String[] position = line.split("\\s+");
                    roverPosition = new RoverPosition(Integer.valueOf(position[0]), Integer.valueOf(position[1]), position[2]);
                    roverPositionList.add(roverPosition);
                } else {
                    RoverPositionUtil.calculateLastRoverPosition(line, roverPosition, boundaryCoordinate);

                }
                counter++;
            }

            printRoverPositions(roverPositionList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void printRoverPositions(List<RoverPosition> roverPositionList) {
        System.out.println("OUTPUT");
        roverPositionList.forEach(roverPosition -> System.out.println(roverPosition.toString()));

    }

}
