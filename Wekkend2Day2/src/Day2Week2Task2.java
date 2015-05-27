import java.util.Scanner;

public class Day2Week2Task2 {

	public static void main(String[] args) {

		/*    Task1
		 * 
		 * 
		 * Scanner in = new Scanner(System.in); int num = in.nextInt(); int num1
		 * = in.nextInt(); for (int i = 1; i <= num; i++) { for (int j = 1; j <=
		 * num1; j++) { System.out.print("* "); } System.out.println();
		 */

		/*    Task2
		 * 
		 * Scanner in = new Scanner(System.in); int num = in.nextInt(); int num1
		 * = in.nextInt();
		 * 
		 * for (int i=1;i<=num;i++){ for(int j=1;j<=num1;j++){ int n=i*j;
		 * System.out.printf("%2d", n); }
		 * 
		 * 
		 * System.out.println();
		 * 
		 */     Task3
		/*
		 * Scanner in = new Scanner(System.in);
		 * 
		 * System.out.println("Unos 1 :"); int num = in.nextInt();
		 * 
		 * boolean prost = true;
		 * 
		 * for (int i = 1; i < num; i++) { for(int j=2;j<i;j++){ if ( i%j==0) {
		 * prost=false; break; }
		 * 
		 * }
		 * 
		 * if (prost == true) { System.out.print(i+" "); } prost=true; }
		 */
		/*
		 * Scanner in = new Scanner(System.in);
		 * 
		 * System.out.println("Unos 1 :"); int num = in.nextInt(); int sum = 0;
		 * 
		 * for (int i = 2; i <= num; i++) { if (num % i == 0) { sum += num / i;
		 * } } if (sum == num) { System.out.println("Number is magic"); } else
		 * System.out.println("Number is not magic");
		 */
		
		
		//
	/*	Scanner in = new Scanner(System.in);

		System.out.println("Unos 1 :");
		int num = in.nextInt();
		int sum = 0;
		int a = num;
		int counter = 0;
		int b = 0;

		while (num > 0) {
			num = num / 10;
			counter++;
		}

		for (int i = 1; i <= counter; i++) {
			b = a % 10;
			sum += b;
			a /= 10;
		}

		System.out.println(sum);
*/
		
		
	}

}
