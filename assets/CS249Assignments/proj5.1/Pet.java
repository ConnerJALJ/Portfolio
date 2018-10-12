/***********************************************************************************************************************
 * Pet object
 * 
 * CS249 with Spetka
 * October 2018
 * Language: Java (javac target)
***********************************************************************************************************************/



public class Pet {
    public String name;
    public int age;
    public double weight;
    public boolean isDog;

    public Pet(){
        this.name = "";
        this.age = 0;
        this.weight = 0;
        this.isDog = true;
    }

    public String toString(){
        return("Name: " + name + "\nAge: " + age + " years"
                + "\nWeight: " + weight + " pounds");
    }

    public Pet(String newName) {
        name = newName;
        age = 0;
        weight = 0;
        isDog = true;
    }

    public Pet(String initialName, int initialAge, double initialWeight, boolean initialSpecies) {
        name = initialName;
        if (initialAge < 0 || initialWeight < 0) {
            System.out.println("Error: Negative age or weight");
            System.exit(0);
        } else {
            age = initialAge;
            weight = initialWeight;
        }
        isDog = initialSpecies;
    }

    public void set(String newName, int newAge, double newWeight, boolean newSpecies) {
        name = newName;
        if (newAge < 0 || newWeight < 0) {
            System.out.println("Error: Negative age or weight");
            System.exit(0);
        } else {
            age = newAge;
            weight = newWeight;
            isDog = newSpecies;
        }
    }

    public String getPetName(){
        return name;
    }
    public void setPetName(String name){
        this.name = name;
    }

    public int getPetAge(){
        return age;
    }
    public void setPetAge(int age){
        this.age = age;
    }

    public double getPetWeight(){
        return weight;
    }
    public void setPetWeight(double weight){
        this.weight = weight;
    }

    public boolean getPetSpecies(){
        return isDog;
    }
    public void setPetSpecies(boolean isDog){
        this.isDog = isDog;
    }

    public double acepromazine(){
        return 0;
    }
    public double carprofen(){
        return 0;
    }
}