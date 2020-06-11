public class FindDigitSolution {

	public static void main(String[] args) {

		System.out.println(findDigits(111));
	}

	static int findDigits(int n) {

		String tempString = String.valueOf(n);

		int counter = 0;
		for (int i = 0; i < tempString.length(); i++) {
			int numericValue = Character.getNumericValue(tempString.charAt(i));
			if (numericValue != 0 && n % numericValue == 0) {
				counter++;
			}
		}

		return counter;

		// Way 2
		/*
		 * char[] charArray = String.valueOf(n).toCharArray();
		 * 
		 * int count = 0; for (char c : charArray) { int temp =
		 * Integer.parseInt(String.valueOf(c)); if (temp !=0 && n % temp == 0) {
		 * count++; } }
		 * 
		 * return count;
		 */

	}

}
