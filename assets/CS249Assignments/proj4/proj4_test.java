/***********************************************************************************************************************
 * Test file code for saving an old pizza order.
 * 
 * CS249 with Spetka
 * September 2018
 * Language: Java (javac target)
***********************************************************************************************************************/

public class proj4_test {
    public static void main(String[] args){

        PizzaOrder order = new PizzaOrder();
        order.setNumOfPizzas(4);

        Pizza pie0 = new Pizza("large",1,0,1);
        order.setPizza(0, pie0);

        Pizza pie1 = new Pizza("medium",2,2,0);
        order.setPizza(1, pie1);

        Pizza pie2 = new Pizza("small",1,1,0);
        order.setPizza(2, pie2);

        Pizza pie3 = new Pizza("large",4,2,1);
        order.setPizza(3, pie3);


        double total = order.calcTotal();

        System.out.println(pie0.getDescription());
        System.out.println(pie1.getDescription());
        System.out.println(pie2.getDescription());
        System.out.println(pie3.getDescription());


        System.out.println("Total cost: $" + total);
    }
}