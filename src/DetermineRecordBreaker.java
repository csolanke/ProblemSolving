import java.util.Arrays;

public class DetermineRecordBreaker {

	public static void main(String[] args) {
		int[] input = { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };
		System.out.println(Arrays.toString(breakingRecords(input)));

	}

	static int[] breakingRecords(int[] scores) {
		int minTemp;
		int maxTemp;
		int maxRecordBreakCount = 0;
		int minRecordBreakCount = 0;
		int returnArr[] = new int[2];

		minTemp = scores[0];
		maxTemp = scores[0];
		for (int i = 0; i < scores.length - 1; i++) {
			if (minTemp > scores[i + 1]) {
				minTemp = scores[i + 1];
				minRecordBreakCount++;
			}
			if (maxTemp < scores[i + 1]) {
				maxTemp = scores[i + 1];
				maxRecordBreakCount++;
			}
		}
		returnArr[0] = maxRecordBreakCount;
		returnArr[1] = minRecordBreakCount;

		return returnArr;

	}

}
