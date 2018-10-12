/***********************************************************************************************************************
 * Dog subclass of Pet
 * 
 * CS249 with Spetka
 * October 2018
 * Language: Java (javac target)
***********************************************************************************************************************/

public class Dog extends Pet {
    @Override
    public double acepromazine() {
        return ((weight / 2.2) * (0.03 / 10));
    }

    @Override
    public double carprofen() {
        return ((weight / 2.2) * (0.5 / 12));
    }

    Dog(String name, int age, double weight, boolean isDog){
        super(name, age, weight, isDog);
    }
}
