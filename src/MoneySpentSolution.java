import java.util.Arrays;
import java.util.Collections;

public class MoneySpentSolution {
	
	public static void main(String[] args) {
		
		int a[]= {3,1};
		int b[] ={5,2,8};
		
		System.out.println(getMoneySpent(a,b,10));
		
		
	}
	//My Way of solving the problem
	/*static int getMoneySpent(int[] keyboards, int[] drives, int b) {

		ArrayList<Integer> resultList = new ArrayList<>();

		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				if (keyboards[i] + drives[j] <= b) {
					resultList.add(keyboards[i] + drives[j]);
				}
			}
		}
		return resultList.stream().mapToInt(s -> s).max().orElse(-1);

	}*/

	
	
	//Approach available on Internet which is the optimised way.
	static int getMoneySpent(int[] keyboars, int[] drivs, int b) {
		
		Integer[] keyboards = Arrays.stream(keyboars).boxed().toArray(Integer[]::new);
		Integer[] drives = Arrays.stream(drivs).boxed().toArray(Integer[]::new);
	
	  Arrays.sort(keyboards, Collections.reverseOrder());//Descending order
      Arrays.sort(drives);//Ascending order
      
      int max = -1;
      for(int i = 0, j = 0; i < keyboards.length; i++){
          for(; j < drives.length; j++){
              if(keyboards[i]+drives[j] > b) break; //This prevents j from incrementing
              if(keyboards[i]+drives[j] > max)
                  max = keyboards[i]+drives[j];
          }
      }
      return max;
	}	
	
	
}
