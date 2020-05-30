
public class CatAndMouse {
	
	public static void main(String[] args) {
		
		
	}

	static String catAndMouse(int x, int y, int z) {

		return Math.abs(x - z) < Math.abs(y - z) ? "Cat A" : (Math.abs(x - z) == Math.abs(y - z)) ? "Mouce C" : "Cat B";

	}
	

	/*if (Math.abs(x - z) < Math.abs(y - z)) {
		return "Cat A";
	} else if (Math.abs(x - z) == Math.abs(y - z)) {
		return "Mouce C";
	} else {
		return "Cat B";
	}*/
	
}
