package com.stackroute.oops;

public class VehicleService {
    /*
    create a Car object and return it
     */
    public Car createCar(String name, String modelName, String type) {
        return new Car(name, modelName, type);
    }

    /*
    create a bike object and return it
     */
    public Bike createBike(String name, String modelName, String type) {
        return new Bike(name, modelName, type);
    }

    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returns -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first, Vehicle second) {
        /*
        Vehicle objects should be down casted to their respective concrete types
        */
        int speed1 = first.maxSpeed("sports");
        int speed2 = second.maxSpeed("sports");
        if (speed1 > 0 && speed2 > 0) {
            return Math.max(speed1,speed2);
        }
        else {
            return -1;
        }
    }
}
