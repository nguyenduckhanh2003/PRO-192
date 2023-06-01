/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarManager;

/**
 *
 * @author Dell
 */
public class Car {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public Car() {
        this.colour = "";
    }

    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    public String getColour() {
        return colour;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }
    
    public String toString() {
        return "Car{" + "colour=" + colour + ", enginePower=" + enginePower + ", convertible=" + convertible + ", parkingBrake=" + parkingBrake + '}';
    }
    
}
