/**
 * Program Name: Letter Distribution
 * Description: A program that takes an input of a text file and calculates the occurence of each letter in the alphabet
 * as a percentage.
 * Author: Badr Choubai
 * Date: November 3, 2020
 * Version: 4
 *
 * Vocabulary Word (non-computer related)
 *
 *      Resilience
 *
 *          The ability of a system to recover from perturbation;
 *          the ability to restore or repair or bounce back after a change
 *          due to an outside force.
 *
 *
 * Inspirational Quote and Author (non-political, non-religious)
 *
 *      “There is too much bad news to justify complacency. There is too much good news to justify despair.”
 *      ~ Donella H. Meadows, Thinking in Systems: A Primer
 *
 *      “Antifragility is beyond resilience or robustness. The resilient resists shocks and stays the same;
 *      the antifragile gets better.”
 *      ~ Nassim Nicholas Taleb, Antifragile: Things That Gain from Disorder
 *
 */

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class LetterDistribution {
    static final String LETTERS_IN_THE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final String FILE_NAME = "src/Rudolph.txt";
    static final int FRAME_WIDTH = 1024;
    static final int FRAME_HEIGHT = 768;

    public static void main(String[] args) throws FileNotFoundException {
        /* Utilizing a HashMap allows us to keep track of all our application data
         * We need to be able to track each letter's occurrence to display in the
         * barchart as a percentage in the final output
         */
        Map<Character, Integer> letterFrequency = new HashMap<Character, Integer>(26);
        List<Double> percentages = new ArrayList<Double>(26);
        for (char letter : LETTERS_IN_THE_ALPHABET.toCharArray()) {
            letterFrequency.put(letter, 0);
        }

        /*  Set up a Scanner that reads a file */
        File file = new File(FILE_NAME);
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNext()) {
            for (char c : fileScanner.next().toLowerCase().toCharArray()) {
                if (letterFrequency.keySet().contains(c)) {
                    int curr = letterFrequency.get(c);
                    letterFrequency.put(c, ++curr);
                }
            }
        }

        fileScanner.close();

        // https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
        // https://docs.oracle.com/javase/tutorial/collections/streams/reduction.html
        // https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html

        // Use Stream.reduce() to sum all the letter occurrences
        int totalLetterCount = letterFrequency
                .values()
                .stream()
                .reduce(0, (a, b) -> a + b);

        // Use Stream.forEach() to iterate each value of our letterFrequencyValues stream,
        // calculate its occurrence as a percentage and add it to our percentages ArrayList.
        letterFrequency
                .values()
                .stream()
                .forEach(count -> {
                    double percentage = ((double) count / (double) totalLetterCount) * 100;
                    percentages.add(percentage);
                });

        // Convert our percentages ArrayList to a static Array of doubles.
        double[] finalPercentages = percentages
                .stream()
                .mapToDouble(i -> i)
                .toArray();

        JFrame f = new JFrame();
        f.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        String title = FILE_NAME.split("\\.")[0];
        BarChart barchart = new BarChart(title, LETTERS_IN_THE_ALPHABET.split(""), finalPercentages);
        f.getContentPane().add(barchart);

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        f.addWindowListener(wndCloser);
        f.setVisible(true);
    }
}
