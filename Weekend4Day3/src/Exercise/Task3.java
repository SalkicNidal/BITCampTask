package Exercise;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// Input size of matrix with Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int size = input.nextInt();
		int[][] Matrix = new int[size][size];
		// Fill matrix with -1 in  the random index
		for (int i = 0; i < Matrix.length; i++) {
				Matrix[((int)(Math.random()*size))][(int)(Math.random()*size)]=-1;
		}
		array.print2D(Matrix);
		System.out.println();
		 // Finding mine in matrix and calculating the mine, with catch exception
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				if (Matrix[i][j] == -1) {
					try {
						if (Matrix[i + 1][j] != -1)
							Matrix[i + 1][j]++;
					} catch (Exception e) {
					}
					try {
						if (Matrix[i][j + 1] != -1)
							Matrix[i][j + 1]++;
					} catch (Exception e) {
					}
					try {
						if (Matrix[i + 1][j+1] != -1)
							Matrix[i + 1][j+1]++;
					} catch (Exception e) {
					}
					try {
						if (Matrix[i + 1][j - 1] != -1)
							Matrix[i + 1][j - 1] ++;
					} catch (Exception e) {
					}
					try {
						if (Matrix[i - 1][j + 1] != -1)
							Matrix[i - 1][j + 1] ++;
					} catch (Exception e) {
					}
					try {
						if (Matrix[i][j - 1] != -1)
							Matrix[i][j - 1] ++;
					} catch (Exception e) {
					}
					try {
						if (Matrix[i - 1][j] != -1)
							Matrix[i - 1][j] ++;
					} catch (Exception e) {
					}
					try {
						if (Matrix[i - 1][j - 1] != -1)
							Matrix[i - 1][j - 1] ++;
					} catch (Exception e) {
					}
				
				}

			}

		}  for (int i = 0; i < Matrix.length; i++) {
			System.out.print("[	");
			for (int j = 0; j < Matrix[i].length; j++) {
				if (Matrix[i][j] == -1) {
					System.err.print("*	");
				}
				else if (Matrix[i][j] == 0) {
					System.out.print("/	");
				}
				else 
					System.out.print(Matrix[i][j]+" 	");
				}
			System.out.println(" ]");
			System.out.println();
			
		}
	}
}
