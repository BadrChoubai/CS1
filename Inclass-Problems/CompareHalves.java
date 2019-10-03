class CompareHalves {
	public static void main(String[] args) {
		System.out.println(solution("badr", "brad"));
		System.out.println(solution("than", "then"));
	}

	public static String solution(String strOne, String strTwo) {
		String strOneHalf = strOne.substring(0, strOne.length() / 2);
		String strTwoHalf = strTwo.substring(0, strOne.length() / 2);

		String answer = strOneHalf.equals(strTwoHalf) 
			? "Halves are the same" 
			: "Halves are not the same";

		return answer;
	}
}