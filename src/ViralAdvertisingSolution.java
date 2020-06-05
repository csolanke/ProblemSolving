
public class ViralAdvertisingSolution {

	public static void main(String[] args) {
		System.out.println(viralAdvertising(5));
	}

	static int viralAdvertising(int n) {

		int totalLikes = 0;
		int newLikes = 2;
		int temp = 2;
		for (int i = 1; i <= n; i++) {
			if (i > 1) {
				newLikes = Math.floorDiv((temp * 3), 2);
			}

			totalLikes += newLikes;
			temp = newLikes;
		}
		return totalLikes;
	}

}
