/***********************************************************************************************************************
 * Programming Project 4.12 asked you to create a PizzaOrder class that stores an order
 * consisting of up to three pizzas. Modify the class to store the pizzas using an array.
 * This will allow the class to include an arbitrary number of pizzas in the order instead of a maximum of three.
 * The setNumPizzas method can be used to create an array of the appropriate size.
 * The array structure allows you to eliminate the methods setPizza1 , setPizza2 , and setPizza3 and
 * replace them with a single method, setPizza(int index , Pizza newPizza ).
 * Include appropriate tests to determine if the new PizzaOrder class is working correctly.
 * 
 * 
 * CS249 with Spetka
 * September 2018
 * Language: Java (javac target)
***********************************************************************************************************************/

public class PizzaOrder {
    private int numOfPizzas;
    private Pizza newPie;
    private Pizza[] pies;

    public PizzaOrder(){
        this.numOfPizzas = 0;
        this.newPie = null;
        this.pies = new Pizza[numOfPizzas];
    }

    public PizzaOrder(int numOfPizzas, Pizza[] pies){
        setNumOfPizzas(numOfPizzas);
        for(int i = 0; i < numOfPizzas; i++){
            setPizza(i, newPie);
        }
    }

    public void setNumOfPizzas(int numOfPizzas){
        this.numOfPizzas = numOfPizzas;
        this.pies = new Pizza[numOfPizzas];
    }

    public void setPizza(int index, Pizza newPie){
        pies[index] = newPie;
    }


    public double calcTotal(){
        double total = 0.0;
        if(numOfPizzas != 0) {
            for (int i = 0; i < numOfPizzas; i++) {
                total += pies[i].calcCost();
            }
        }
        return total;
    }

}