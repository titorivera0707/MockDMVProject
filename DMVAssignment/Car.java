//Tito Rivera trivera26@toromail.csudh.edu

public class Car {

    private static int vinCounter = 1234;
    private String make;
    private String model;
    private String color;
    private String VIN;

    public Car(String make, String model, String color) {
        this.make = make;
        this.color = color;
        this.model = model;
        this.VIN = "VIN" + (vinCounter++);
    }

    public int getVinCounter() {
        return vinCounter;
    }

    public void setVinCounter(int vinCounter) {
        this.vinCounter = vinCounter;
    }

    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public boolean equals(Object o) {
        Car other = (Car)o;

        return other.make == this.make&&
        other.color == this.color &&
        other.model == this.model &&
        other.VIN == this.VIN;
    }

    public String toString() {
        return "Car Make : " + make + "\n Car Model : " + model + "\n Car Color : " + color + "\n Car VIN : " + VIN;
    }

}