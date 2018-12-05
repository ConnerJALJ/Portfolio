/***********************************************************************************************************************
 * Write a generic class, MyMathClass, with a type parameter T where T is a numeric object type
 * (e.g., Integer, Double, or any class that extends java.lang.Number ).
 * Add a method named standardDeviation that takes an ArrayList of type T and returns as a double
 * the standard deviation of the values in the ArrayList.
 * Use the doubleValue() method in the Number class to retrieve the value of each number as a double.
 * Refer to Programming Project 6.5 for a definition of computing the standard deviation.
 * Test your method with suitable data.
 * Your program should generate a compile-time error if your standard deviation method
 * is invoked on an ArrayList that is defined for nonnumeric elements (e.g., Strings ).
 * 
 * CS249 with Spetka
 * October 2018
 * Language: Java (javac target)
***********************************************************************************************************************/
import java.util.*;

public class proj9_test {
    public static void main(String args[]){
        ArrayList<Double> doubles = new ArrayList<Double>();
        ArrayList<Integer> integers = new ArrayList<Integer>();

        for (double i = 1; i < 5.5; i += 0.5) {
            doubles.add(i);
        }

        for (int i = 1; i < 10; i++){
            integers.add(i);
        }

        MyMathClass<Double> doubleObject = new MyMathClass<Double>();
        System.out.println( "Standard deviation for double array: " +
                            doubleObject.standardDeviation(doubles)      );

        MyMathClass<Integer> intObject = new MyMathClass<Integer>();
        System.out.println( "Standard deviation for integer array: " +
                            intObject.standardDeviation(integers));
    }
}
