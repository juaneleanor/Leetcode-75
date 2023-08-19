import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class kidsWithGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatestNoOfCandies = new ArrayList<Boolean>();
        int maxCandies = Arrays.stream(candies).max().getAsInt();

        for(int i = 0; i < candies.length; i++){
            greatestNoOfCandies.add(candies[i] + extraCandies >= maxCandies);
        }
        return greatestNoOfCandies;
    }
    
    public static void main(String[] args) {
        int[] sample = {2,3,5,1,3};
        System.out.println(kidsWithCandies(sample, 3));
    }
}
