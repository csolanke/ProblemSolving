import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticksSolution {

	public static void main(String[] args) {

		int inputArr[] = { 1, 2, 3, 4, 3, 3, 2, 1 };
		int[] cutTheSticks = cutTheSticks(inputArr);
		Arrays.stream(cutTheSticks).forEach(s -> System.out.println(s));

	}

	static int[] cutTheSticks(int[] arr) {

		List<Integer> inputlist = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> listToReturn = new ArrayList<>();

		Collections.sort(inputlist);
		while (inputlist.size() >= 1) {
			Arrays.sort(arr);
			int cutSize = inputlist.get(0);

			List<Integer> cuttedList = inputlist.stream().map(in -> in - cutSize).collect(Collectors.toList());

			List<Integer> elementsToRemove = new ArrayList<>();
			cuttedList.forEach(s -> {
				if (s.intValue() == 0) {
					elementsToRemove.add(s);
				}
			});

			int cuttedElements = cuttedList.size();
			listToReturn.add(cuttedElements);
			cuttedList.removeAll(elementsToRemove);

			inputlist = cuttedList;
		}
		return listToReturn.stream().mapToInt(i -> i).toArray();

	}
}
