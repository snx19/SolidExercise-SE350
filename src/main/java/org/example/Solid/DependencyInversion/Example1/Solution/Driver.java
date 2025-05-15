package org.example.Solid.DependencyInversion.Example1.Solution;

/**
 * Represents a driver
 * can use any type of car
 */
public class Driver {
    public static void main(final String[] args) {
        RacingCar car = new RacingCar(10);

        car.accelerate();
    }
}
