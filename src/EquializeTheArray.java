import java.util.HashMap;
import java.util.NoSuchElementException;

public class EquializeTheArray {
	public static void main(String[] args) {

		int input[] = {1,2,3,1,2,3,3,3 };
		System.out.println(equalizeArray(input));
	}

	static int equalizeArray(int[] arr) {

		HashMap<Integer, Integer> myMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			Integer count = myMap.getOrDefault(arr[i], 0);
			myMap.put(arr[i], count + 1);
		}

		return arr.length - myMap.entrySet().stream().map(st -> st.getValue()).mapToInt(val -> val).max()
				.orElseThrow(NoSuchElementException::new);
	}

}
