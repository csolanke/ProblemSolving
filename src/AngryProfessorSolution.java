import java.util.Arrays;

public class AngryProfessorSolution {

	public static void main(String[] args) {
		
		int inputArray[] = {-93,-86,49,-62,-90 ,-63,40,72,11,67};
        System.out.println(angryProfessor(10, inputArray));		
	}
	
	// Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
    long count = Arrays.stream(a).filter(el->el<=0).count();
    	return count >=k ?"NO":"YES";
    }
	
	
}
