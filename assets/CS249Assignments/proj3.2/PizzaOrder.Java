/***********************************************************************************************************************
 * Programming Project 4.12 asked you to create a PizzaOrder class that stores an order consisting of up to three pizzas.
 * Extend this class with the following methods and constructor:
 *     • public int getNumPizzas() — returns the number of pizzas in the order.
 *     • public Pizza getPizza1() — returns the first pizza in the order or null if pizza1 is not set.
 *     • public Pizza getPizza2() — returns the second pizza in the order or null if pizza2 is not set.
 *     • public Pizza getPizza3() — returns the third pizza in the order or null if pizza3 is not set.
 *     • A copy constructor that takes another PizzaOrder object and makes an independent copy of its pizzas.
 * This might be useful if using an old order as a starting point for a new order.
 * Write a main method to test the new methods.
 * Changing the pizzas in the new order should not change the pizzas in the original order.
 * For example, Pizza pizza1 = // Code to create a large pizza, 1 cheese, 1 ham
 *              Pizza pizza2 = // Code to create a medium pizza, 2 cheese, 2 pepperoni
 *              PizzaOrder order1 = // Code to create an order
 *              order1.setNumPizzas(2); // 2 pizzas in the order
 *              order1.setPizza1(pizza1); // Set first pizza
 *              order1.setPizza2(pizza2); // Set second pizza
 *              double total = order1.calcTotal(); // Should be 18+20 = 38
 *              PizzaOrder order2 = new PizzaOrder(order1); // Use copy constructor
 *              order2.getPizza1().setNumCheeseToppings(3); // Change toppings
 *              double total = order2.calcTotal(); // Should be 22 + 20 = 42
 *              double origTotal = order1.calcTotal(); // Should still be 38
 * Note that the first three lines of code are incomplete. You must complete them as part of the Programming Project.
 * 
 * 
 * CS249 with Spetka
 * September 2018
 * Language: Java (javac target)
 */
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

    public PizzaOrder(PizzaOrder order){
        if(order == null) {
            return;
        }
        numOfPizzas = order.numOfPizzas;

        if(order.pie1 == null){
            pie1 = null;
        }else{
            pie1 = new Pizza(order.pie1);
        }
        if(order.pie1 == null){
            pie2 = null;
        }else{
            pie2 = new Pizza(order.pie2);
        }
        if(order.pie3 == null){
            pie3 = null;
            }else{
                pie3 = new Pizza(order.pie3);
            }
        }

    public void setNumOfPizzas(int numOfPizzas){
        if(numOfPizzas < 1){
            this.numOfPizzas = 1;
        }else if(numOfPizzas > 3){
            this.numOfPizzas = 3;
        }else{
            this.numOfPizzas = numOfPizzas;
            }
    }

    public void setPie1(Pizza pie1) {
        if (numOfPizzas >= 1) {
            this.pie1 = pie1;
        } else {
            this.pie1 = null;
        }
    }
    public void setPie2(Pizza pie2){
        if(numOfPizzas >= 2) {
            this.pie2 = pie2;
        }else{
            this.pie2 = null;
        }
    }
    public void setPie3(Pizza pie3){
        if(numOfPizzas >= 3) {
            this.pie3 = pie3;
        }else{
            this.pie3 = null;
        }
    }

    public int getNumOfPizzas(){
        return numOfPizzas;
    }

    public Pizza getPie1(){
        return pie1;
    }
    public Pizza getPie2(){
        return pie2;
    }
    public Pizza getPie3(){
        return pie3;
    }

    public double calcTotal(){
        double total = 0.00;
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