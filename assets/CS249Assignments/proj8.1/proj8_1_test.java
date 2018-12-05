/***********************************************************************************************************************
 *  Define an interface named Shape with a single method named area that calculates
 *  the area of the geometric shape:
 *      public double area();
 *  Next, define a class named Circle that implements Shape . The Circle class should
 *  have an instance variable for the radius, a constructor that sets the radius, accessor/
 *  mutator methods for the radius, and an implementation of the area method. Also
 *  define a class named Rectangle that implements Shape . The Rectangle class
 *  should have instance variables for the height and width, a constructor that sets the
 *  height and width, accessor and mutator methods for the height and width, and an
 *  implementation of the area method.
 * 
 * CS249 with Spetka
 * October 2018
 * Language: Java (javac target)
***********************************************************************************************************************/
public class proj8_1_test {
    public static void main(String args[]){
        Circle c = new Circle(4);
        Rectangle r = new Rectangle(4,3);
        ShowArea(c);
        ShowArea(r);
    }

    private static void ShowArea(Shape s){
        double area = s.area();
        System.out.println("The area of the shape is " + area);
    }
}