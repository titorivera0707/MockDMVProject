//Tito Rivera trivera26@toromail.csudh.edu
import java.util.*;
import java.io.*;

public class WaitingInLine {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);

        int userNumber = 0;
        
        while(userNumber != 4) {

            System.out.println("Hello, Choose An Option.");
            System.out.println("1 - Register a Car\n2 - Search a Car\n3 - Print Report\n4 - Exit\n");
            System.out.print("Please enter your choice: ");
            userNumber = keyboard.nextInt();

            while(userNumber < 1 || userNumber >4) {
                System.out.print("Please use a valid number 1-4");
                userNumber = keyboard.nextInt();
            }

            if (userNumber == 1) {
                Person newPerson = new Person(null, null, null);
                Car carAdd = new Car(null, null, null);
                Registration newReg = new Registration(null, null);
                System.out.print("Enter name: ");
                newPerson.setName(keyboard.next());
                System.out.print("Enter email: ");
                newPerson.setEmail(keyboard.next());
                System.out.print("Phone number: ");
                newPerson.setPhoneNumber(keyboard.next());

                System.out.print("Car Make : ");
                carAdd.setMake(keyboard.next());
                System.out.print("Car Model : ");
                carAdd.setModel(keyboard.next());
                System.out.print("Car Color : ");
                carAdd.setColor(keyboard.next());
                System.out.print("Car VIN : (Must start with VIN)");
                carAdd.setVIN(keyboard.next());


                Registration r=DMV.register(carAdd, newPerson);

                System.out.println("Thank you, the license number is " + r.getLicenseNumber());

            }

            else if(userNumber == 2) {
                String searchString = null;
                System.out.print("Enter License Number: ");
                searchString = (keyboard.next());
                System.out.println(DMV.find(searchString));

            }

            else if(userNumber == 3) {
                //Print DMV report
            }

            else{
                System.exit(0);
            }

    }

        keyboard.close();
    }

}