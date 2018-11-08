/***********************************************************************************************************************
 *  You have collected a file of movie ratings where each movie is rated from 1 (bad) to 5 (excellent).
 *  The first line of the file is a number that identifies how many ratings are in the file.
 *  Each rating then consists of two lines:
 *  the name of the movie followed by the numeric rating from 1 to 5.
 *
 *  Here is a sample rating file with four unique movies and seven ratings:
 * ****************EXAMPLE****************
 *  Harry Potter and the Half-Blood Prince
 *  4
 *  Harry Potter and the Half-Blood Prince
 *  5
 *  Army of the Dead
 *  1
 *  Harry Potter and the Half-Blood Prince
 *  4
 *  Army of the Dead
 *  2
 *  The Uninvited
 *  4
 *  Pandorium
 *  3
 * ****************EXAMPLE****************
 *
 *  Write a program that reads a file in this format, calculates the average rating for each movie,
 *  and outputs the average along with the number of reviews.
 *  Here is the desired output for the sample data:
 *
 *  Harry Potter and the Half-Blood Prince: 3 reviews, average of 4.3 / 5
 *  Army of the Dead: 2 reviews, average of 1.5 / 5
 *  The Uninvited: 1 review, average of 4 / 5
 *  Pandorium: 1 review, average of 3 / 5
 *
 *  Use a HashMap or multiple HashMaps to calculate the output.
 *  Your map(s) should index from a string representing each movie’s name to integers
 *  that store the number of reviews for the movie and the sum of the ratings for the movie.
***********************************************************************************************************************/
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;

public class proj10_test {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> reviewMap = new HashMap<>();
        HashMap<String, Double> averageRatingMap = new HashMap<>();

        String st;
        BufferedReader ratingBuffer = new BufferedReader(new FileReader("ratings"));
        while((st = ratingBuffer.readLine()) != null){
            if(!reviewMap.containsKey(st)){
                reviewMap.put(st, 1);
                averageRatingMap.put(st, Double.parseDouble(ratingBuffer.readLine()));
            }else{
                reviewMap.put(st, (reviewMap.get(st)+1));
                averageRatingMap.put(st, (Double.parseDouble(ratingBuffer.readLine()) + averageRatingMap.get(st)));
            }
        }

        Iterator it = reviewMap.entrySet().iterator();
        DecimalFormat decimal = new DecimalFormat("####.#");
        while (it.hasNext()){
            HashMap.Entry entry = (HashMap.Entry) it.next();
            String key = (String) entry.getKey();

            averageRatingMap.put(key, (averageRatingMap.get(key) / reviewMap.get(key)));

            System.out.println( key + ": " + entry.getValue()             +
                                " review(s), average of "                 +
                                decimal.format(averageRatingMap.get(key)) +
                                " / 5"                                   );
        }
    }
}
