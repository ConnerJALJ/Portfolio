/***********************************************************************************************************************
 * Programming Project 7.8 required rewriting the solution to Programming Project 4.10 with inheritance. 
 * Redo or do Programming Project 7.8, but instead define the Pet class as an abstract class. 
 * The acepromazine() and carprofen() methods should be defined as abstract methods.
 * In your main method, define an array of type Pet and add two instances of cats and two instances of dogs to the array. 
 * Iterate through the array and output how much carprofen and acepromazine each pet would require.
 * 
 * CS249 with Spetka
 * October 2018
 * Language: Java (javac target)
***********************************************************************************************************************/

public class proj5_2_test {
    public static void main(String args[]){
        Pet[] pets = new Pet[4];

        for(int i= 0; i< pets.length; i++) {
            pets[i] = new Dog();
            String species = pets[i].setSpecies();
            if(!pets[i].setIsDog()){
                pets[i] = new Cat(species);
            }

            pets[i].setName(pets[i].getName());
            pets[i].setAge(pets[i].getAge());
            pets[i].setWeight(pets[i].getWeight());
            System.out.println("\n");
        }

        System.out.println("Records show: \n");
        for(int i= 0; i< pets.length; i++) {
            System.out.println(pets[i]);
            System.out.println("Acepromazine needed: "+ pets[i].acepromazine()+ " ml");
            System.out.println("Carprofen needed: "+ pets[i].carprofen()+ " ml");
            System.out.println("\n");
        }
    }
}
