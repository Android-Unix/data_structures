package Problems;

import java.util.Scanner;

public class PatternProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i = n; i >= 0; i--) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <  2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
