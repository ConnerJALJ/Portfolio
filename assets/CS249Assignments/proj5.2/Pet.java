/***********************************************************************************************************************
 * Pet object
 * 
 * CS249 with Spetka
 * October 2018
 * Language: Java (javac target)
***********************************************************************************************************************/

import java.util.Scanner;

abstract class Pet {
    Scanner input = new Scanner(System.in);

    String name, species;
    int age;
    double weight;
    boolean isDog = false;

    Pet(){
        this.name = "";
        this.age = 0;
        this.weight = 0.00;
        this.species = "";
    }

    Pet(String species){
        this.name = "";
        this.age = 0;
        this.weight = 0.00;
        this.species = species;
    }

    String setSpecies(){
        System.out.println("Is the animal a Dog or Cat?");

        String species = input.nextLine();
        this.species = species;

        return species;
    }

    boolean setIsDog(){
        if(this.species.equalsIgnoreCase("Dog")){
            isDog = true;
        }else if(this.species.equalsIgnoreCase("Cat")){
            isDog = false;
        }else{
            System.out.println("Error: Unknown species entered");
            System.exit(0);
        }

        return isDog;
    }

    String getName(){
        System.out.println("What is the "+ species+ "'s name?");
        return name;
    }
    void setName(String name){
        name = input.nextLine();
        this.name = name;
    }

    int getAge(){
        System.out.println("What is "+ name+ "'s age?");
        return age;
    }
    void setAge(int age){
        age = input.nextInt();
        this.age = age;
    }

    double getWeight() {
        System.out.println("What is "+ name+ "'s weight?");
        return weight;
    }
    void setWeight(double weight) {
        weight = input.nextDouble();
        this.weight = weight;
    }

    abstract double acepromazine();
    abstract double carprofen();

    public String toString(){
        return("Name: "+ name+
               "\nSpecies: "+ species+
               "\nAge: "+ age+ " years"+
               "\nWeight: "+ weight+ " pounds");
    }
}
