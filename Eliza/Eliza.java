
/*
Program: Eliza 
Author: J. Gurka
Date: August 2019

Description: This program "talks" to a human in a fashion similar to a psychologist.

Reference: Based on the original Eliza program by Joseph Weisenbaum.  See "Eliza" on 
Wikipedia for history of the program and its importance in AI.

Assumptions and limitations:
1. Many limitations due to the complexity of natural language processing.
2. Punctuation is not handled well.
3. Contractions can cause problems.
4. Eliza doesn't "know" anything.
*/

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Eliza {

   private boolean talkSessionRequested;
   private Scanner talkScanner;
   private ArrayList<String> genericAnswers;
   private int genericCount;
   private Random randomGenerator;
   private String userName, userAnswer, ElizaAnswer;

   public Eliza () {
      // set-up
      genericAnswers = new ArrayList<String>(20);
      genericCount = 0;
      randomGenerator = new Random();
      loadGenericAnswers();
      talkScanner = new Scanner(System.in);
   }

   private void loadGenericAnswers() {
      // read answers for Eliza responses
      Scanner genericScanner = null; 
      try {
         genericScanner = new Scanner(new File("generic_answers.txt"));
         while (genericScanner.hasNext()) {
            genericAnswers.add(genericScanner.nextLine());
            genericCount++;
         }
      }
      catch (Exception ex) {
         System.out.println("Error reading generic answers, program ending.");
         System.exit(1);
      }
      genericScanner.close();
   }

   public void introduceEliza() {
      System.out.println("-----------\n");
      System.out.println("Welcome to Eliza, one of the earliest programs to talk to the user.");
      System.out.println("It was first written in the 1960's by Joseph Weisenbaum\n"
                         + "to investigate AI and natural language processing.\n");
      System.out.println("Eliza is designed to interact with a user like a psychologist,");
      System.out.println("asking questions and responding to the answers.\n");
      System.out.println("Is Eliza intelligent?  You decide ...");
      System.out.println("\n-----------\n");
   }

   public void startConversation() {
   
    //   boolean talkRequested;
   
      System.out.println("Hi, I'm Eliza. What's your name?"); 
      System.out.print("You > ");
      userName = talkScanner.nextLine();
      System.out.println("Hi, " + userName + "!  Want to chat for awhile?");
      System.out.print(userName + " > ");
      userAnswer = talkScanner.nextLine(); 

      if ((userAnswer.length() >=3 &&
             userAnswer.substring(0, 3).equalsIgnoreCase("yes")) ||
          (userAnswer.length() >=2 &&
             userAnswer.substring(0, 2).equalsIgnoreCase("ok"))) {
         talkSessionRequested = true;
      }
        else {
         talkSessionRequested = false;   
      }
   }

   public void talk () {
   
      System.out.println("Eliza > How are you today?");
      System.out.print(userName + " > ");
      userAnswer = talkScanner.nextLine();
      do {
         // parse user answer and respond appropriately
         if (userAnswer.length() >= 4 &&
             userAnswer.substring(0,4).equalsIgnoreCase("I am")) {
            ElizaAnswer = "Why are you " + userAnswer.substring(5) + "?";

         }
           else if (userAnswer.contains("sister")   ||
                    userAnswer.contains("brother")  ||
                    userAnswer.contains("mother")   ||
                    userAnswer.contains("father")     ) {
            ElizaAnswer = "Tell me more about your family.";                    
         }
            else if (userAnswer.length() >= 2 &&
                     userAnswer.substring(0,2).equalsIgnoreCase("no")) {
            ElizaAnswer = "Don't be so negative.";
         }       
           else {
            ElizaAnswer = genericAnswers.get(randomGenerator.nextInt(genericCount));            
         }
         
         if (!userAnswer.equalsIgnoreCase("bye")) {
            System.out.println("Eliza > " + ElizaAnswer);
            System.out.print(userName + " > ");
            userAnswer = talkScanner.nextLine();
         }
         
      } while (!userAnswer.equalsIgnoreCase("bye"));       // end main talk loop   
      
      System.out.println("Eliza > See you later ...");
       
   }  // end talk method

   public static void main (String args[]) {
   
      Eliza myEliza = new Eliza();
      myEliza.introduceEliza();
      myEliza.startConversation();

      if (myEliza.talkSessionRequested) {
         myEliza.talk();
      }
        else {
         System.out.println("Eliza > OK, maybe tomorrow.  Bye, bye!");
      }
   }  // end main method

}  // end Eliza