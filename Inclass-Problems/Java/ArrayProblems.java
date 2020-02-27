import java.util.Arrays;

class ArrayProblems {
	public static void main(String[] args) {
		int[] input = {10,20,30,40,50};
		int[] inputWithZeroes = {1,0,2,0,3};
		subtractEachBy(input, 1);
		allToZero(input);
		countZeros(inputWithZeroes);
		sumArray(input);
	}

	static String subtractEachBy(int[] input, int by) {
		for (int i = 0; i < input.length - 1; i++) {
			input[i] = input[i] - 1;
		}
		return Arrays.toString(input);
	}

	static int[] allToZero(int[] input) {
		for (int i = 0; i < input.length; i++) {
			input[i] = 0;
		}
		return input;
	}

	static int countZeros(int[] input) {
		int count = 0;

		for (int number : input) {
			if (number == 0) {
				count++;
			}
		}

		return count;
	}

	static int sumArray(int[] input) {
		int sum = 0;
		for (int number : input) {
			sum+=number;
		}
		return sum;
	}
}