/*
    For two strings s and t, we say "t divides s" if and only if s = t + ... + t 
    (i.e., t is concatenated with itself one or more times).

    Given two strings str1 and str2, 
    return the largest string x such that x divides both str1 and str2.
*/
public class greatestCommonDivisorForStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if (str1.equals(str2)){
            return str1;
        }

        if((str1 + str2).equals(str2 + str1)){
            int gcd = 1;
            for (int i = 1; i <= str1.length() && i <= str2.length(); ++i) {
                if (str1.length() % i == 0 && str2.length() % i == 0){
                  gcd = i;
                }
            }
            return str1.substring(0, gcd);
        }
        
        return "";
    }
    
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABABAB", "ABAB"));
        System.out.println(gcdOfStrings("NLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGM", "NLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGM"));
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "AB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }
    
}
