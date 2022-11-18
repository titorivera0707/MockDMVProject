//Tito Rivera trivera26@toromail.csudh.edu

import java.io.*;
import java.util.*;

public class DMV {

    private static ArrayList<Registration> reg = new ArrayList<Registration>();

    public static Registration register(Car car, Person owner) {

        Registration r = new Registration(car, owner);
        reg.add(r);

        return r;

    }

    public static void list() {
        for(Registration r: reg) {
            System.out.println(r);
        }
    }

    public static Registration find(String licNumber) {

        for(Registration r: reg) {
            if(r.getLicenseNumber().equalsIgnoreCase(licNumber)) return r;
        }

        return null;

    }

    public static String getAll() {

        return reg.toString();

    }

}