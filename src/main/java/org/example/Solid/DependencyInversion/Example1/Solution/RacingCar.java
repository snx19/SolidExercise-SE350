package org.example.Solid.DependencyInversion.Example1.Solution;

/**
 * Represents racing car
 */
public class RacingCar implements Car{
    /** is the remaining fuel racing car has*/
    private int remainingFuel;
    /** is the power racing car has*/
    private int power;

    /**
     * Constructor creates racing car with set fuel
     * @param fuel the amount of fuel a racing car has
     */
    public RacingCar(final int fuel) {
        this.remainingFuel = fuel;
    }

    /**
     * method accelerates car and reduces fuel
     */
    @Override
    public void accelerate() {
        power++;
        remainingFuel--;
    }

}
