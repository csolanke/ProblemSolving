
public class UtopianTreeSolution {
	
	public static void main(String[] args) {
		
		System.out.println(utopianTree(5));
		
	}
	// Complete the utopianTree function below.
	static int utopianTree(int n) {
		int height = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				height = height + 1;
			} else if (i == 0) {
				return 1;
			} else {
				height = height * 2;
			}
		}

		return height;
	}

}
