/*
    You are given two strings word1 and word2. 
    Merge the strings by adding letters in alternating order, starting with word1. 
    If a string is longer than the other, append the additional letters onto the end of the merged string.
    
    Return the merged string.
*/

public class mergeStringsAlternately{
    public static String mergeAlternately(String word1, String word2){
        String merged = "";
        int index = 0;
        
        if(word1.length() == word2.length()){
            for(int i=0; i < word1.length(); i++){
                char a = word1.charAt(i);
                char b = word2.charAt(i);
                merged = merged + a + b;
            }
        }

        if(word1.length() < word2.length()){
            for(int i=0; i < word1.length(); i++){
                char a = word1.charAt(i);
                char b = word2.charAt(i);
                merged = merged + a + b;
                index = i;
            }

            for(int j =  index + 1; j < word2.length(); j++){
                char b = word2.charAt(j);
                merged = merged + b;
            }
        }

        if(word1.length() > word2.length()){
            for(int i=0; i < word2.length(); i++){
                char a = word1.charAt(i);
                char b = word2.charAt(i);
                merged = merged + a + b;
                index = i;
            }

            for(int j =  index + 1; j < word1.length(); j++){
                char a = word1.charAt(j);
                merged = merged + a;
            }
        }
        return merged;
    }
    
    public static String mergeAlternatelySolution(String word1, String word2){
        StringBuilder merged = new StringBuilder();
        int i = 0;

        while(i < word1.length() || i < word2.length()){
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                merged.append(word2.charAt(i));
            }
            i++;
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternatelySolution("abc", "pqr"));
        System.out.println(mergeAlternatelySolution("ab", "pqrs"));
        System.out.println(mergeAlternatelySolution("abcd", "pq"));
    }
}
