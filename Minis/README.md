# CS 1, Fall 2019

Dr. Gurka \
Project #4: Minis \
August 27

---

## Overview

Three separate programs using basic Java statements.

Major topics

- Writing programs from scratch.
- Screen output formatting.
- User keyboard input.

### Program #1: Numbers

- Write a complete program that prompts the user for two integers and then prints the following report to the screen, exactly as shown.

### Program #2: Initials

- Write a complete program that prompts the user to enter their first name, middle name, and last name (separately).  Print out their name and initials.

### Program #3: Restaurant Bill

- Write a complete program that calculates a restaurant bill.  Prompt the user for the check amount, then ask the user what type of tip they would like to leave: the choices are good tip (20%), average tip (15%), poor tip (10%).  Input this choice by asking the user to enter 1 for a good tip (20%), 2 for an average tip (15%), or 3 for a poor tip (10%).  Use their input and an if-else to calculate the tip amount.  Then calculate and output the final bill.

## Challenges

- On the Numbers program, add a try-catch section to handle a user entering non-numeric data (for example, "cat" instead of 23).  If they do not enter a number, the program should print an error message and stop.

- On the Numbers program, include division, and produce a real number answer (i.e., fractional parts).  Division of two integers gives an integer, so one of the values needs to be cast to a double before the computation.  Example, if value1 and value2 are integers:
(double) value1 / value2.

- On the restaurant bill program, also add in 7% tax.  Calculate tax on the initial bill (not including the tip); calculate the tip on the initial bill (not including the tax).  Add a line of output giving the tax amount.

## Deliverables

- one cover letter
- output screen shots: two sample runs for each program; use cut and paste from the output.
- source code (three .java classes)
- two test cases for the restaurant program, on the example test plan sheet (from Moodle)
