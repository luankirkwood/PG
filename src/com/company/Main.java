package com.company;

import com.company.Garage.GroundFloor;
import com.company.Garage.Space;
import com.company.Vehicles.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

    public class Main {

        public static void main(String[] args) {
            ArrayList<com.company.Garage.Space> allSpaces = new ArrayList<>();
            createSpaces(allSpaces);

            List<Vehicle> vehicles = new ArrayList<>();
            createVehicles(vehicles);

        }

        public static void createSpaces(List<com.company.Garage.Space> allSpaces){
            ArrayList<Space> groundSpaces = new ArrayList<>();

            GroundFloor.getSpaces(groundSpaces);

            allSpaces.addAll(groundSpaces);


        }

        public static void createVehicles(List<Vehicle> vehicles) {
            List<CanFitInLargeSpace> largeVehicles = Arrays.asList(
                    new Van("KI89JDU"),
                    new Van("HU76UIH")
            );
            List<CanFitInSmallSpace> smallVehicles = Arrays.asList(
                    new Car("BH67HGU"),
                    new Motorbike("PT42FGX"),
                    new Car("XG63BTG")
            );

            vehicles.addAll((Collection<? extends Vehicle>) smallVehicles);
        }
    }

