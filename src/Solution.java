import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(1, 4, 4, 4, 5, 3);
		System.out.println(migratoryBirds(listOfIntegers));
	}

	static Integer migratoryBirds(List<Integer> arr) {

		int type1count = 0 ;
		int type2count = 0, type3count = 0, type4count = 0, type5count = 0;
		Map<Integer, Integer> valueMap = new HashMap<>();
		for (int value : arr) {

			if (value == 1) {
				type1count++;
				valueMap.put(value, type1count);
			} else if (value == 2) {
				type2count++;
				valueMap.put(value, type2count);
			} else if (value == 3) {
				type3count++;
				valueMap.put(value, type3count);
			} else if (value == 4) {
				type4count++;
				valueMap.put(value, type4count);

			} else {
				type5count++;
				valueMap.put(value, type5count);
			}
		}

		Collection<Integer> values = valueMap.values();
		ArrayList<Integer> al = new ArrayList<>();
		al.addAll(values);

		Collections.sort(al);
		
		System.out.println("number of occurance of each values are as follows ::" + al);
		return valueMap.entrySet().stream().filter(v -> al.get(al.size() - 1).equals(v.getValue()))
				.map(Map.Entry::getKey).findFirst().get();

	}

}


