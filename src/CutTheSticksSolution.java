import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticksSolution {

	public static void main(String[] args) {

		int inputArr[] = { 1, 2, 3, 4, 3, 3, 2, 1 };
		int[] cutTheSticks = cutTheSticks(inputArr);
		//Arrays.stream(cutTheSticks).forEach(s -> System.out.println(s));

	}

	static int[] cutTheSticks(int[] arr) {
		
		//My Approach
		
		/*

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
	

	*/
		
		
		//Second and best approach to get the results.
        Arrays.sort(arr);
        int sticksLeft = arr.length;
        
        int curr = arr[0];
        int currCount = 0;
        System.out.println(arr.length);
        //Works by decrementing sticksLeft by the frequency of the smallest stick each time
        for(int i = 0; i < arr.length; i++)
        {
            if(curr == arr[i])
            {
                currCount++;
            }
            else
            {
                sticksLeft -= currCount;
                currCount = 1;
                curr = arr[i];
                System.out.println(sticksLeft);
            }
        }		
		
	return null;
	}
}
