class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = { 0, 3, 1, 8, 7, 2, 5, 4, 6, 9 };
		printArray(numbers);
		int[] sorted = solution(numbers);
		printArray(sorted);
	}

	static int[] solution(int[] inputArray) {
		
		int i, j;
		for(i = 0; i < inputArray.length  - 1; i++) {
			for (j = 1; j < inputArray.length - i - 1; j++) {
				if (inputArray[j] > inputArray[j+1]) {
					int swap = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j + 1] = swap; 
				}
			}
		}

		return inputArray;
	}

	static void printArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.printf("%d ", input[i]);
		}
		System.out.println();
	}
}
