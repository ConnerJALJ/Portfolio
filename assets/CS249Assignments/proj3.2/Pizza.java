/*********************************************************************************************************************** 
 * Pizza Constructors
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
        setSizeOfPizza(sizeOfPizza);
        setNumOfCheese(numOfCheeses);
        setNumOfPepperoni(numOfPepperonis);
        setNumOfHam(numOfHams);
    }

    public Pizza(Pizza pie){
        if(pie == null){
            return;
        }

        this.sizeOfPizza = pie.sizeOfPizza;
        this.numOfCheeses = pie.numOfCheeses;
        this.numOfPepperonis = pie.numOfPepperonis;
        this.numOfHams = pie.numOfHams;
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