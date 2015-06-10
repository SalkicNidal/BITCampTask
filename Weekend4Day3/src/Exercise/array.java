package Exercise;

import java.awt.font.TextHitInfo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class array {
	/**
	 * Input the value of elements
	 * 
	 * @param matrix
	 *            - 2D array
	 */
	public static void fillMatrix(int[][] matrix) {
		int counteri = -1, counterj = 0;
		while (true) {
			Scanner input = new Scanner(System.in);
			try {
				if (counteri != -1) {
					for (int i = counteri; i < matrix.length; i++) {
						for (int j = counterj; j < matrix[i].length; j++) {
							System.out.println("Enter the " + (i + 1)
									+ " element of row,and " + (j + 1)
									+ " element of column");
							int element = input.nextInt();
							matrix[i][j] = element;
						}
					}
				} else {
					for (int i = 0; i < matrix.length; i++) {
						for (int j = 0; j < matrix[i].length; j++) {
							counteri = i;
							counterj = j;
							System.out.println("Enter the " + (i + 1)
									+ " element of row,and " + (j + 1)
									+ " element of column");
							int element = input.nextInt();
							matrix[i][j] = element;

						}
					}
				}
				break;
			} catch (InputMismatchException e) {
				System.out
						.println("You can only entered the  positive numbers");
				input.next();

			}

		}
	}

	/**
	 * Print to console 2D Array
	 * 
	 * @param Array
	 *            - 2D array
	 */
	public static void print2D(int[][] Array) {

		for (int i = 0; i < Array.length; i++) {
			System.out.print("[	");
			for (int j = 0; j < Array[i].length; j++) {

				System.out.print(Array[i][j] + "	");

			}
			System.out.print("]");
			System.out.println();
		}

	}

	/**
	 * Calculating determinate of 3x3 matrix and check they are Singular
	 * 
	 * @param matrix
	 *            -3X3 matrix
	 * @return boolean true- Matrix is singular boolean false-Matrix is not
	 *         singular
	 */
	public static boolean isSingular(int[][] matrix) {

		int det = (matrix[0][0] + matrix[1][1] + matrix[2][2])
				+ (matrix[0][1] + matrix[1][2] + matrix[2][0])
				+ (matrix[0][2] + matrix[1][0] + matrix[2][0]) - matrix[0][1]
				- matrix[1][0] - matrix[2][2] - matrix[0][0] - matrix[1][2]
				- matrix[2][1] - matrix[0][2] - matrix[1][1] - matrix[2][0];
		if (det == 0) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] arr2 = new int[3][3];
		// Enter the values of element matrix with method
		fillMatrix(arr2);
		//Print the matrix
		print2D(arr2);
		System.out.println(isSingular(arr2));
		
		
	}
}
