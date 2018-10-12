/***********************************************************************************************************************
 * Programming Project 4.10 required adding an instance variable to 
 * the Pet class defined in Display 4.15 to indicate if the pet is a dog or cat. 
 * A better organization is to define Pet as a superclass of the Dog and Cat classes. 
 * This organization eliminates the need for an instance variable to indicate the type of the pet.0
 * Do or redo Programming Project 4.10 with inheritance. 
 * The acepromazine() and carprofen() methods should be defined in the Pet class to simply return 0. 
 * Override both methods in the Dog and Cat classes to calculate the correct dosage. 
 * Write a main method with appropriate tests to exercise the changes.
 * 
 * CS249 with Spetka
 * October 2018
 * Language: Java (javac target)
***********************************************************************************************************************/

import java.util.Scanner;

public class proj5_1_test {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("What is the pet's name?");
        String name = input.nextLine();

        System.out.println("What is the pet's age?");
        int age = input.nextInt();

        System.out.println("How much does the pet weigh?");
        double weight = input.nextDouble();

        System.out.println("Is the pet a dog? (y/n)");
        String choice = input.next();

        boolean isDog = choice.equalsIgnoreCase("y") ? true : false;

        Pet p = isDog ? new Dog(name, age, weight, isDog) :
                new Cat(name, age, weight, isDog);


        System.out.println("Records show: ");
        System.out.println(p);
        System.out.println("Acepromazine needed: " + p.acepromazine() + " ml");
        System.out.println("Carprofen needed: " + p.carprofen() + " ml");
    }
}