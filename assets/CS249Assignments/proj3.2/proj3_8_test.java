/***********************************************************************************************************************
 * Test code for a saved pizza order
 * 
 * CS249 with Spetka
 * September 2018
 * Language: Java (javac target)
 */
 ***********************************************************************************************************************/

public class proj3_8_test {
    public static void main(String[] args)
    {
        Pizza pie1 = new Pizza("large", 1, 0, 1);
        Pizza pie2 = new Pizza("medium", 2, 2, 0);

        PizzaOrder order1 = new PizzaOrder();
        order1.setNumOfPizzas(2);
        order1.setPie1(pie1);
        order1.setPie2(pie2);
        double totalPrime = order1.calcTotal();

        System.out.println(order1.getPie1().getDescription());
        System.out.println(order1.getPie2().getDescription());
        System.out.println("Total cost of the first order: $" + totalPrime);
        System.out.println();

        PizzaOrder order2 = new PizzaOrder(order1);
        order2.getPie1().setNumOfCheese(3);
        double total2 = order2.calcTotal();

        System.out.println(order2.getPie1().getDescription());
        System.out.println(order2.getPie2().getDescription());
        System.out.println("Total cost of the second order: $" + total2);
        System.out.println();

        double origTotal = order1.calcTotal();
        System.out.println("Total cost of the original order: $" + origTotal);
    }
}
