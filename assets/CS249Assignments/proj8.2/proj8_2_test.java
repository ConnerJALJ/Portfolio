/***********************************************************************************************************************
 * Adds RightTriangle Class to proj8.1
 * 
 * CS249 with Spetka
 * October 2018
 * Language: Java (javac target)
***********************************************************************************************************************/
public class proj8_2_test {
    public static void main(String args[]){
        Circle c = new Circle(4);
        Rectangle r = new Rectangle(4,3);
        RightTriangle t = new RightTriangle(4, 3);

        ShowArea(c);
        ShowArea(r);
        ShowArea(t);
    }

    private static void ShowArea(Shape s){
        double area = s.area();
        System.out.println("The area of the shape is " + area);
    }
}
