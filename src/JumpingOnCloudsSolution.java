
public class JumpingOnCloudsSolution {
	
	
	public static void main(String[] args) {
		
		int [] input ={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		
		System.out.println(jumpingOnClouds(input,1));
		
	}
	
	static int jumpingOnClouds(int[] c, int k) {
		int energyLevel = 100;
		for (int i = 0; i < c.length - 1; i = i + k) {
			if (i + k < c.length) {
				if (c[i + k] == 1)
					energyLevel = energyLevel -= 3;
				else
					energyLevel = energyLevel -= 1;
			}
		}
		return energyLevel - 1;
	}}
