/***********************************************************************************************************************
 * Cat subclass of Pet
 * 
 * CS249 with Spetka
 * October 2018
 * Language: Java (javac target)
***********************************************************************************************************************/

public class Cat extends Pet {
    Cat(String species){
        super(species);
    }


    @Override
    double acepromazine() {
        return ((weight / 2.2) * (0.002 / 10));
    }
    @Override
    double carprofen() {
        return ((weight / 2.2) * (0.25 / 12));
    }
}
