import java.util.List;
import java.util.stream.Collectors;

public class BonApetite {
	
	public static void main(String[] args) {
		
		
		
	}
	
	static void bonAppetit(List<Integer> bill, int k, int b) {

		bill.remove(k);
		long sum = bill.stream().collect(Collectors.summarizingInt(st -> st)).getSum();

		long individualShare = sum / 2;

		int comapreValue = (int) individualShare;

		if (comapreValue == b) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b - comapreValue);
		}

	}


}
