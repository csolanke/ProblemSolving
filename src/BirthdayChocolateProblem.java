import java.util.Arrays;
import java.util.List;

public class BirthdayChocolateProblem {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1);
		
      	System.out.println(	birthday(asList, 18,7));

	}

	static int birthday(List<Integer> s, int d, int m) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < s.size(); i++) {
			for (int j = 0; j<m; j++) {
				if(i+j < s.size())
				{
					sum = s.get(i+j);
					if (sum == d) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
