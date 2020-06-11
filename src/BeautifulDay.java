
public class BeautifulDay {
	public static void main(String[] args) {
		System.out.println(beautifulDays(13,45,3));
	}
	
	//Best way to achieve
	static int beautifulDays(int i, int j, int k) {
		
		int beautifulDay=0;
		for(int x=i;x <=j; x++)
		{
			StringBuffer br = new StringBuffer(String.valueOf(x));
			int reversedValue = Integer.parseInt(br.reverse().toString());
			if(Math.abs(x-reversedValue)%k==0)
			{
				beautifulDay++;
			}
		}
		return beautifulDay;
	}
	
//My Way
	/*static int beautifulDays(int i, int j, int k) {

		int beautifulDay = 0;
		int iterationCount = j - i;
		int startvar = i;
		for (int l = 0; l <= iterationCount; l++) {
			int reversedValueOfInteger = getReversedValueOfInteger(startvar);
			if ((Math.abs(startvar - reversedValueOfInteger)) % k == 0) {
				beautifulDay++;
			}
			startvar++;
		}
		return beautifulDay;

	}

	static int getReversedValueOfInteger(int y) {
		String in = String.valueOf(y);
		StringBuffer br = new StringBuffer();
		for (int i = in.length() - 1; i >= 0; i--) {
			br.append(in.charAt(i));
		}

		String valueToReturn = br.toString();

		return Integer.parseInt(valueToReturn);
	}*/

}
