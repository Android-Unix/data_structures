package Problems;

public class Recaman {
	public static void printRecamanSeq(int n) {
		
		boolean[] marked = new boolean[4 * n];
		
		int count = 1;
		
		int i = 0;
		
		System.out.println(0);
		
		for(int loop = n; loop >= 2; loop--) {
			if(i - count > 0 && !marked[i - count]) {
				i -= count;
				marked[i] = true;
				System.out.println(i);
				count++;
			}
			
			else {
				i += count;
				marked[i] = true;
				System.out.println(i);
				count++;
			}
		}		
	}
	
public static void printSecondRecamanSeq(int n) {
		
		boolean[] marked = new boolean[100000];
		
		int count = 1;
		
		int i = 1;
		
		System.out.println(1);
		
		for(int loop = n; loop >= 2; loop--) {
			if(i % count == 0 && !marked[i / count]) {
				i /= count;
				marked[i] = true;
				System.out.println(i);
				count++;
			}
			
			else {
				i *= count;
				marked[i] = true;
				System.out.println(i);
				count++;
			}
		}		
	}
}
