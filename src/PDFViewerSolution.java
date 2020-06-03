
public class PDFViewerSolution {
	
	public static void main(String[] args) {
		
		int [] inputArray = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
		System.out.println(designerPdfViewer(inputArray,"abc"));
	}
	
	static int designerPdfViewer(int[] h, String word) {
		char ch[] = word.toCharArray();
		int n = ch.length;
		int max = 0;
		for(int i=0;i<n;i++)
		{
		int k = (int)ch[i] -97;
		if(max < h[k])
		max = h[k];
		}
		int res = max * n;
		return res;
		}
	
}
