/***********************************************************************************************************************
 * Dog subclass of Pet
 * 
 * CS249 with Spetka
 * October 2018
 * Language: Java (javac target)
***********************************************************************************************************************/

public class Dog extends Pet {
    @Override
    double acepromazine() {
        return ((weight / 2.2) * (0.03 / 10));
    }
    @Override
    double carprofen() {
        return ((weight / 2.2) * (0.5 / 12));
    }
}
