/***********************************************************************************************************************
 * Test code for a multiple pizza order
 * 
 * CS249 with Spetka
 * September 2018
 * Language: Java (javac target)
 ***********************************************************************************************************************/


public class proj3_12_test {
    public static void main(String[] args){
        Pizza pie1 = new Pizza("large",1,0,1);
        Pizza pie2 = new Pizza("medium",2,2,0);
        PizzaOrder order = new PizzaOrder();
        order.setNumOfPizzas(2);
        order.setPie1(pie1);
        order.setPie2(pie2);
        double total = order.calcTotal();

        System.out.println(pie1.getDescription());
        System.out.println(pie2.getDescription());
        System.out.println("Total cost: $" + total);
    }
}
