import java.time.Duration;
import java.time.Instant;

/*
    After watching this video https://www.youtube.com/watch?v=bVJ-mWWL7cE 
*/

public class ToUpper {
    public static void main(String[] args) {
        String chars = "RfoZVrcLrHTsJVZPPOIuIRSrmtixifKFGagFiNbuFQFyvqhPdPAuToATxxUAhNwlxmWpdUIIItJSlaQawvVlzPjCYeItEAylEIPr";
        char[] branchless = chars.toCharArray();
        char[] branched = chars.toCharArray();

        Instant start = Instant.now();
        branchless = branchlessToUpper(branchless);
        Instant end = Instant.now();
        System.out.println("Branchless: "+ Duration.between(start, end)); // prints PT1M3.553S

        Instant start2 = Instant.now();
        branched = branchedToUpper(branched);
        Instant end2 = Instant.now();
        System.out.println("Branched: "+ Duration.between(start2, end2)); // prints PT1M3.553S
    }    

    public static char[] branchlessToUpper(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            chars[i] = toUpper(chars[i]);
        }

        return chars;
    }

    public static char[] branchedToUpper(char[] chars) {
        for (int i = 0; i < chars.length; ++i) {
            if (!Character.isUpperCase(chars[i])) {
                chars[i] = toUpper(chars[i]);
            }
        }

        return chars;
    }

    private static char toUpper(char ch) {
        return ch -= 32 * (ch >= 'a' && ch <= 'z' ? 1 : 0);
    }
}