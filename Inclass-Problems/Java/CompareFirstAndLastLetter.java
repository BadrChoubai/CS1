class CompareFirstAndLastLetter {
	public static void main(String[] args) {
		System.out.println(solution("abracadabra"));
		System.out.println(solution("alakazam"));
	}

	public static String solution(String input) {
		char firstLetter = input.charAt(0);
		char lastLetter = input.charAt(input.length() - 1);

		String answer = Character.compare(firstLetter, lastLetter) == 0 
			? "first and last character are same"
			: "first and last character are not the same";

		return answer;
	}
};