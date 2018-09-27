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
        setSizeOfPizza(sizeOfPizza);
        setNumOfCheese(numOfCheeses);
        setNumOfPepperoni(numOfPepperonis);
        setNumOfHam(numOfHams);
    }

    public String getSizeOfPizza()
    {
        return sizeOfPizza;
    }
    public void setSizeOfPizza(String sizeOfPizza)
    {
        this.sizeOfPizza = sizeOfPizza;
    }

    public int getNumOfCheese()
    {
        return numOfCheeses;
    }
    public void setNumOfCheese(int numOfCheeses)
    {
        this.numOfCheeses = numOfCheeses;
    }

    public int getNumOfPepperoni()
    {
        return numOfPepperonis;
    }
    public void setNumOfPepperoni(int numOfPepperonis)
    {
        this.numOfPepperonis = numOfPepperonis;
    }

    public int getNumOfHam()
    {
        return numOfHams;
    }
    public void setNumOfHam(int numOfHams)
    {
        this.numOfHams = numOfHams;
    }


    public double calcCost() {
        double totalCost = (numOfCheeses + numOfPepperonis + numOfHams) * 2;
        if (sizeOfPizza.equalsIgnoreCase("small")) {
            totalCost += 10;
        } else if (sizeOfPizza.equalsIgnoreCase("medium")) {
            totalCost += 12;
        } else if (sizeOfPizza.equalsIgnoreCase("large")) {
            totalCost += 14;
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

