import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class kidsWithGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatestNoOfCandies = new ArrayList<Boolean>();
        
        for(int i = 0; i < candies.length; i++){
            int givenExtraCandies = candies[i] + extraCandies;

            if(givenExtraCandies >= Arrays.stream(candies).max().getAsInt()){
                greatestNoOfCandies.add(i, true);
            }else{
                greatestNoOfCandies.add(i, false);
            }
        }
        return greatestNoOfCandies;
    }
    
    public static void main(String[] args) {
        int[] sample = {2,3,5,1,3};
        System.out.println(kidsWithCandies(sample, 3));
    }
}
