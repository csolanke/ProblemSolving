
public class PageSolution {
	public static void main(String[] args) {
		
		System.out.println(pageCount(59867,35733));
		
	}
	
	
	static int pageCount(int n, int p) {

		if (p > n / 2) {
			if (p== n - 1) {
				return 1;
			} else if (p == n) {
				return 0;
			} else {
				return (n-p)/ 2;
			}
		}

		else {
			if (p == 2) {
				return 1;
			} else if (p == 1) {
				return 0;
			} else {
				return p/2;
			}
		}

	}

}
