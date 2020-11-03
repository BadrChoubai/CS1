import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class LetterDistribution
{
    static final String LETTERS_IN_THE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int    FIRST_LETTER            = 'a';
    static final String FILE_NAME               = "Constitution.txt";
    static final int    FRAME_WIDTH             = 1024;
    static final int    FRAME_HEIGHT            = 768;

    public static void main(String[] args) throws FileNotFoundException
    {
        /* Utilizing a map allows us to keep track of all our application's
         * We need to be able to track each letter's occurence
         * to display in the barchart
         */
        Map<Character, Integer> letterFrequency = new HashMap<Character, Integer>(26);
        for (char c : LETTERS_IN_THE_ALPHABET.toCharArray())
        {
            letterFrequency.put(c, 0);
        }

        /*
         * Set up a Scanner that reads a file
         */
        File file = new File(FILE_NAME);
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNext())
        {
            for (char c : fileScanner.next().toCharArray())
            {
                if (letterFrequency.keySet().contains(c))
                {
                    int curr = letterFrequency.get(c);
                    curr++;
                    letterFrequency.put(c, curr);
                }
            }
        }

        fileScanner.close();

        // Get the total letter count
        // https://docs.oracle.com/javase/tutorial/collections/streams/reduction.html
        int totalLetterCount = letterFrequency
            .values()
            .stream()
            .reduce(0, (a, b) -> a + b);

        System.out.println(totalLetterCount);
    }
}
