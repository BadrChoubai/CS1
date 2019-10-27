# CS 1, Fall 2019

Dr. Gurka \
Project #6: Bears And Fish \
Assigned: 2019-10-10 \
Due: 2019-10-31

---

## Program Logic - Bears and Fish

- Greet the user and explain the method
  
- Setup the River
  - make the river size 7
  - fill with blanks
  - print the river

- Add creatures to the initial river
  - Get number of bears from user
  - Get number of fish from user
  - Loop through number of bears selected, placing each one randomly
    - To place a creature: generate a random number in the range of 0 to river size - 1
  - Loop through number of fish selected, placing each one
  - print the populated river with a message

- Main animation loop
  - Print the current river before changes
  - Outer loop: run through the array 5 times (five "generations" of the populations)
  - inner loop
    - Run through the array
    - At each creature position randomly decide if it will move left, move right, or stay put.
    - Go Left
      - if in position zero, go to position n - 1, otherwise move left one position.
      - if new position do not empty, check creature, if a bear and fish collide the bear wins, i.e. the fish gets eaten.
      - if two bears collide keep both in their current position and place a bear in a random index. Same for two fish.
    - Go Right, similar but watch for position 9.
    - Stay Put, nothing to do.
  - After one pass through the array print the updated river.

---

## Details

### Random Number Generator Example

```java

import java.util.Random;

public class NumberGenerator {
  public static void main(String[] args) {
    Random numberGenerator = new Random();

    for (int i = 0; i <= 10; i++) {
      System.out.println(numberGenerator.nextInt(3) - 1)
    }
  }
}

```

### Development

First write all the methods, stubbed, then work on implementing one method at a time. You should always have a running program, while you are working on the next method to be implemented. Then ensure the program runs properly with the new method, Don't move to another method until the current on is finsihed and correct (unless you are waiting to come in for help). Comment out the stubs in the final version of your program.

### Testing  

Sinece a random number generator is involved, testing has to be by your carefult review of each iteration of the simulation. Check to see that each update (bears and fish moving, disappearing, being created) is being handle correctly on each pass of the simulation.

### Grading

- Compiles without errors, runs without crashing, and gets correct answers

- Bears and Fish program handles all cases (moves, bears eating fish, new creatures created)
  - I will run your program
  
- All deliverables submitted (below)

- All specifications followed

- A running Bears and Fish program will get partial credit if it successfully meets some of the specifications; no credit for non-running program.

### Submission

- Due: 2019-10-31
- Deliverables
  - One Cover letter
  - Additional Question
    - What interesting behaviour did you see?
  - Source Code

---

### Challenges

- When the user enters the value for the number of bears and for the number of fish, check to make sure the total does not exceed the river size (7)

- After each pass through the river, also print the current number of bears and fish.

- (Hard) Add the idea of a lifetime to each creature. On every pass through the array, each creature loses one life point. When they reach zero, they disappear from the simulation.
