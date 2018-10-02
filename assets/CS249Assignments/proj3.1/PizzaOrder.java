/***********************************************************************************************************************
 * This programming project extends Programming Project 4.11.
 * Create a PizzaOrder class that allows up to three pizzas to be saved in an order.
 * Each pizza saved should be a Pizza object as described in Programming Project 4.11.
 * In addition to appropriate instance variables and constructors, add the following methods:
 *      # public void setNumPizzas(int numPizzas) //sets the number of pizzas in the order. numPizzas must be between 1 and 3.
 *      # public void setPizza1(Pizza pizza1) //sets the first pizza in the order.
 *      # public void setPizza2(Pizza pizza2) //sets the second pizza in the order.
 *      # public void setPizza3(Pizza pizza3) //sets the third pizza in the order.
 *      # public double calcTotal() //returns the total cost of the order.
 * Write a main method to test the class. The setPizza2 and setPizza3 methods will be used only if
 * there are two or three pizzas in the order, respectively.
 * Sample code illustrating the methods is shown below. Note that first three lines are incomplete.
 * You must complete them as part of the Programming Project.
 *      # Pizza pizza1 = // Code to create a large pizza, 1 cheese, 1 ham
 *      # Pizza pizza2 = // Code to create a medium pizza, 2 cheese, 2 pepperoni
 *      # PizzaOrder order = // Code to create an order
 *      # order.setNumPizzas(2); // 2 pizzas in the order
 *      # order.setPizza1(pizza1); // Set first pizza
 *      # order.setPizza2(pizza2); // Set second pizza
 *      # double total = order.calcTotal(); // Should be 18+20 = 38
 * 
 * CS249 with Spetka
 * September 2018
 * Language: Java (javac target)
***********************************************************************************************************************/

public class PizzaOrder {
    private int numOfPizzas;
    private Pizza pie1;
    private Pizza pie2;
    private Pizza pie3;

    public PizzaOrder(){
        this.numOfPizzas = 0;
        this.pie1 = null;
        this.pie2 = null;
        this.pie3 = null;
    }

    public PizzaOrder(int numOfPizzas, Pizza pie1, Pizza pie2, Pizza pie3){
        setNumOfPizzas(numOfPizzas);
        setPie1(pie1);
        setPie2(pie2);
        setPie3(pie3);
    }

    public void setNumOfPizzas(int numOfPizzas){
        if(numOfPizzas < 1) {
            this.numOfPizzas = 1;
        }else if(numOfPizzas > 3){
            this.numOfPizzas = 3;
        }else{
            this.numOfPizzas = numOfPizzas;
        }
    }

    public void setPie1(Pizza pie1){
        if(numOfPizzas >= 1){
            this.pie1 = pie1;
        }else{
            this.pie1 = null;
        }
    }
    public void setPie2(Pizza pie2){
        if(numOfPizzas >= 2){
            this.pie2 = pie2;
        }else{
            this.pie2 = null;
        }
    }
    public void setPie3(Pizza pie3){
        if(numOfPizzas >= 3){
            this.pie3 = pie3;
        }else{
            this.pie3 = null;
        }
    }

    public double calcTotal(){
        double total = 0.0;
        if(pie1 != null){
            total += pie1.calcCost();
        }
        if(pie2 != null){
            total += pie2.calcCost();
        }
        if(pie3 != null){
            total += pie3.calcCost();
        }
        return total;
    }
}