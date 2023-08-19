/*
    There are n kids with candies. You are given an integer array candies, 
    where each candies[i] represents the number of candies the ith kid has, 
    and an integer extraCandies, denoting the number of extra candies that you have.

    Return a boolean array result of length n, where result[i] is true if, 
    after giving the ith kid all the extraCandies, they will have the greatest 
    number of candies among all the kids, or false otherwise.

    Note that multiple kids can have the greatest number of candies.
*/

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

    public static List<Boolean> kidsWithCandiesFaster(int[] candies, int extraCandies) {
        
        List<Boolean> greatestNoOfCandies = new ArrayList<Boolean>();
        
        //Faster than using stream
        int maxCandies = 0;
        for (int kid : candies) {
            if (kid > maxCandies) {
                maxCandies = kid;
            }
        }

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
