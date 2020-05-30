import java.util.Arrays;

public class HurdleRace {

	public static void main(String[] args) {

		int[] input = { 2, 5, 4, 5, 2 };
		System.out.println(hurdleRace(7, input));
	}

	static int hurdleRace(int k, int[] height) {
		int maxElement = Arrays.stream(height).max().orElse(0);
		return maxElement < k ? 0 : maxElement - k;
	}
}
