/***********************************************************************************************************************
 * Create a class named Pizza that stores information about a single pizza. It should contain the following:
 *  #   Private instance variables to store the size of the pizza (either small, medium,
 *      or large), the number of cheese toppings, the number of pepperoni toppings,
 *      and the number of ham toppings.
 *  #   Constructor(s) that set all of the instance variables.
 *  #   Public methods to get and set the instance variables.
 *  #   A public method named calcCost( ) that returns a double that is the cost
 *      of the pizza.
 *
 * Pizza cost is determined by:
 *  #   Small: $10 + $2 per topping
 *  #   Medium: $12 + $2 per topping
 *  #   Large: $14 + $2 per topping
 *
 *  #   A public method named getDescription( ) that returns a String containing
 *      the pizza size, quantity of each topping, and the pizza cost as calculated
 *      by calcCost( ) .
 * Write test code to create several pizzas and output their descriptions.
 * For example, a large pizza with one cheese, one pepperoni and two ham toppings should cost a total of $22.
 *  
 * CS249 with Spetka
 * September 2018
 * Language: Java (javac target)
 ***********************************************************************************************************************/


public class Pizza {
    private String sizeOfPizza;
    private int numOfCheeses;
    private int numOfPepperonis;
    private int numOfHams;

    public Pizza() {
        this.sizeOfPizza = "";
        this.numOfCheeses = 0;
        this.numOfPepperonis = 0;
        this.numOfHams = 0;

    }

    public Pizza(String sizeOfPizza, int numOfCheeses, int numOfPepperonis, int numOfHams) {
        this.sizeOfPizza = sizeOfPizza;
        this.numOfCheeses = numOfCheeses;
        this.numOfPepperonis = numOfPepperonis;
        this.numOfHams = numOfHams;
    }

    public double calcCost() {
        double totalCost = (numOfCheeses + numOfPepperonis + numOfHams) * 2;
        if (sizeOfPizza.equalsIgnoreCase("small")) {
            totalCost += 10;
        } else if (sizeOfPizza.equalsIgnoreCase("medium")) {
            totalCost += 12;
        } else if (sizeOfPizza.equalsIgnoreCase("large")) {
            totalCost += 12;
        } else {
            totalCost = 0.0;
        }
        return totalCost;
    }

    public String getDescription() {
        return "Pizza size: " + sizeOfPizza + "\n Cheese toppings: "
                + numOfCheeses + "\n Pepperoni toppings: "
                + numOfPepperonis + "\n Ham toppings: " + numOfHams
                + "\n Pizza cost: $" + calcCost() + "\n";
    }
}

