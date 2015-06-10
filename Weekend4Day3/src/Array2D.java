import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array2D {
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
				System.err.println
						("You can only entered the  positive numbers");
				System.out.println();
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
	 * Print entered column of 2d array
	 * 
	 * @param array
	 *            - 2D array
	 * @param column
	 *            - number of column
	 * @return 1D array which element elements of 2D column
	 */
	public static int[] getColumn(int[][] array) {

		Scanner input = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Enter the index of column");
				int indx = input.nextInt();
				int arr[] = new int[array.length];
				for (int i = 0; i < array.length; i++) {
					arr[i] = array[i][indx];
				}
				System.out.println("Finding colums is :");
				return arr;

			} catch (IndexOutOfBoundsException e) {
				System.out.println("Entered column not exist");
				input.nextLine();

			} catch (InputMismatchException e) {
				System.out
						.println("You can only entered the  positive numbers");
				input.next();

			}
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Repeat program if throw exception
		while (true) {
			try {
				// Input the number of columns and rows with Scanner
				System.out.println("Enter the number of columns");
				int columns = input.nextInt();
				System.out.println("Please enter the number of row");
				int row = input.nextInt();
				// Declaration of 2D array
				int[][] matrix = new int[columns][row];
				// Input value of elements of 2Darray with method
				fillMatrix(matrix);
				// Print the 2D array with method
				System.out.println("Your entered matrix is: ");
				print2D(matrix);
				// Finding the entered column in the 2D array
				System.out.println(Arrays.toString(getColumn(matrix)));
				break;
				
			// Catch possible exception
			} catch (NegativeArraySizeException e) {
				System.out.println("You can only enter the possitive number");

			} catch (InputMismatchException e) {
				System.out
						.println("You can only entered the  positive numbers");
				input.next();

			}
		}

	}
}
