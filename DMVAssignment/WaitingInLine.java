//Tito Rivera trivera26@toromail.csudh.edu
import java.util.*;
import java.io.*;

public class WaitingInLine {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);

        int userNumber = 0;
        
        //Wrap the entire program in a while loop in order to repeat function.
        while(userNumber != 4) {

            //Ask user to choose an option to begin program
            System.out.println("\nHello, Choose An Option.");
            System.out.println("1 - Register a Car\n2 - Search a Car\n3 - Print Report\n4 - Exit\n");
            System.out.print("Please enter your choice: ");
            userNumber = keyboard.nextInt();

            //Error checking in case the user types an invalid number.
            while(userNumber < 1 || userNumber >4) {
                System.out.print("Please use a valid number 1-4: ");
                userNumber = keyboard.nextInt();
            }

            if (userNumber == 1) {
                Person newPerson = new Person(null, null, null);
                Car carAdd = new Car(null, null, null);

                //Asking user personal questions.
                keyboard.nextLine();
                System.out.print("Enter name: ");
                newPerson.setName(keyboard.nextLine());
                System.out.print("Enter email: ");
                newPerson.setEmail(keyboard.next());
                System.out.print("Phone number: ");
                newPerson.setPhoneNumber(keyboard.next());

                //Asking user questions about the car
                System.out.print("Car Make : ");
                carAdd.setMake(keyboard.next());
                System.out.print("Car Model : ");
                carAdd.setModel(keyboard.next());
                System.out.print("Car Color : ");
                carAdd.setColor(keyboard.next());

                Registration r=DMV.register(carAdd, newPerson);

                System.out.print("Car VIN : "+carAdd.getVIN()+"\n");

                //Creates a new license number for the vehicle.
                System.out.println("Thank you, your new license number is " + r.getLicenseNumber()+".\n");

            }

            //Searches for an exact license number and prints content.
            else if(userNumber == 2) {
                String searchString = null;
                System.out.print("Enter License Number: ");
                searchString = (keyboard.next());
                if(DMV.find(searchString) == null)
                System.out.println("Invalid License Plate. Please try again.\n");
                else
                System.out.println(DMV.find(searchString));

            }

            //Prints everything contained in the arraylist found in the DMV class.
            else if(userNumber == 3) {
                System.out.println(DMV.getAll());
            }

            //Exits program once user is finished using it.
            else{
                System.exit(0);
            }

    }

        keyboard.close();
    }

}