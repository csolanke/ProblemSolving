import java.util.HashMap;
import java.util.stream.Collectors;

public class SockMerchant {
	public static void main(String[] args) {
		
		int[] testArray = {10,20,20,10,10,30,50,10,20};
		
		System.out.println(sockMerchant(9,testArray));
			
	}

	static int sockMerchant(int n, int[] ar) {
		HashMap<Integer, Integer> myMap = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			int temp = ar[i];
			Integer count = 0;
			for (int j = 0; j < ar.length; j++) {
				if (temp == ar[j]) {
					count++;
					myMap.put(temp, count);
				}
			}
		}
		long sum = myMap.values().stream().map(val -> val / 2).collect(Collectors.summarizingInt(x -> x)).getSum();
		return (int) sum;

    }
	
	
}
