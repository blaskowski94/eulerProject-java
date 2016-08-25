package eulerProject;

import java.util.Arrays;
import java.util.Scanner;

public class Problem18 {

	public static void main(String[] args) {
		int[][] a = readInput();
		
	}
	
	public static int[][] readInput(){
		int[][] a = new int[15][15];
		Scanner scan = new Scanner(System.in);
		int j = 0;
		while (scan.hasNextLine() && j < 15) {
				for (int i = 0; i <= j; i++) {
					a[j][i] = scan.nextInt();
				}
			j++;
		}
		scan.close();
		return a;
	}
}
