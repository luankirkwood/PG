package com.company.Garage;

import java.util.List;

public class GroundFloor extends AbstractFloor {
    public static void getSpaces(List<Space> groundSpaces) {
        Integer size = 15;
        String floorName = "Ground";
        createSpaces(groundSpaces, size, floorName);
    }
}