
public class Kangaroo {

	public static void main(String[] args) {

		System.out.println(kangaroo(43,5,49,3));

	}

	static String kangaroo(int x1, int v1, int x2, int v2) {

		if (x1 < x2 && v1 > v2) {

			if ((x2 + v2) % v1 == 0) {
				return "YES";
			} else {
				return "NO";
			}

		}

		else {
			if (x1 > x2 && v1 < v2) {
				if ((x1 + v1) % v2 == 0) {
					return "YES";
				} else {
					return "NO";
				}
			}

		}

		return "NO";
	}

}
