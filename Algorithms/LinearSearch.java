import java.util.Random;

class LinearSearch {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] shuffledInput = randomizeArray(input);

        int search = 6;

        solution(input, search);

        System.out.println(solution(shuffledInput, search));
    }

    static boolean solution(int[] inputArray, int searchValue) {
        boolean wasFound = false;
        for (int i = 0; i < inputArray.length; i++) {
            if (i == searchValue) {
                wasFound = true;
            }
        }
        return wasFound;
    }

    static int[] randomizeArray(int[] array) {
        Random rgen = new Random(); // Random number generator

        for (int i = 0; i < array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        return array;
    }
}