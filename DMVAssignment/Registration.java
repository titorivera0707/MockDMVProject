//Tito Rivera trivera26@toromail.csudh.edu
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.event.CaretListener;

public class Registration {

    private static final int DEFAULT_EXPIRY = 6;
    private static int licenseCounter = 1234;
    private static final long SIX_MONTHS = 1555200000;
    private Car car;
    private Person owner;
    private String licenseNumber;
    private Date expiryDate;

    public Registration(Car car, Person owner) {

        super();
        this.car = car;
        this.owner = owner;
        this.licenseNumber = "LIC" + licenseCounter++;
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, c.get(Calendar.MONTH) + DEFAULT_EXPIRY);
        this.expiryDate = c.getTime();

    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getDate() {
        return expiryDate;
    }

    public String toString() {
        
        SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy");
        return car.toString()+"\n"+owner.toString()+"\nLicenseNumber : "+licenseNumber+"\n"+dt.format(expiryDate);

    }
}