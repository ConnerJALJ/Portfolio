/***********************************************************************************************************************
 * Enhances main and ShowArea methods from 8.2
 * creates an array of shapes and prints the area and type of shape for each shape in the array
***********************************************************************************************************************/
import java.text.DecimalFormat;
import java.util.Random;

public class proj8_3_test {
    public static void main(String args[]){
        Shape[] shapes = new Shape[6];
        Random random = new Random();


        for (int i = 0; i < shapes.length ; i++) {
            int type = random.nextInt(3);
            switch (type){
                case 0:
                    shapes[i] = new Circle(random.nextDouble() * 10);
                    break;
                case 1:
                    shapes[i] = new Rectangle(random.nextDouble() * 10, random.nextDouble() * 10);
                    break;
                case 2:
                    shapes[i] = new RightTriangle(random.nextDouble() * 10, random.nextDouble() * 10);
                    break;
                default:
                    System.out.println("Fatal Error");
                    System.exit(0);
            }
        }
        ShowArea(shapes);
    }

    private static void ShowArea(Shape[] shapes){
        DecimalFormat output = new DecimalFormat("####0.00");

        for (int i = 0; i < 6; i++) {
            double area = shapes[i].area();
            System.out.println("The area of the " + shapes[i].getClass().getName() + " is " + output.format(area));
        }
    }
}
