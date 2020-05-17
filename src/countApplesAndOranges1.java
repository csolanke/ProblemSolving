import java.util.Arrays;

public class countApplesAndOranges1 {
	
	public static void main(String[] args) {
		
		int []apples={-2,2,1};
		int []oranges={5,-6};
				
	  countApplesAndOranges(7,11,5,15,apples,oranges);
	}
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int[] array = Arrays.stream(apples).map(ie -> ie + a).toArray();
		int[] orangeArray = Arrays.stream(oranges).map(oe -> oe + b).toArray();

		System.out.println(Arrays.stream(array).filter(st -> st >= s && st <= t).count());
		System.out.println(Arrays.stream(orangeArray).filter(st -> st >= s && st <= t).count());
	}
}


