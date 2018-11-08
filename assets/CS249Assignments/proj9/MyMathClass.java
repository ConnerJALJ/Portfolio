import java.util.ArrayList;

public class MyMathClass<T extends Number> {
    public double standardDeviation(ArrayList<T> numbers){
        double average = 0;
        double stdDeviation = 0;


        for (int i = 0; i < numbers.size(); i++) {
            average += numbers.get(i).doubleValue();
        }

        average /= numbers.size();

        for (int i = 0; i < numbers.size() ; i++) {
            stdDeviation += (numbers.get(i).doubleValue() - average) *
                            (numbers.get(i).doubleValue() - average) ;
        }

        stdDeviation = Math.sqrt(stdDeviation / numbers.size());
        return stdDeviation;
    }
}
