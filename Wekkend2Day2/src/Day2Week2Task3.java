import java.util.Scanner;

public class Day2Week2Task3 {

	public static void main(String[] args) {
		
		   // Task1 Unosi broj sve dok se ne ukuca paran broj

		Scanner in = new Scanner(System.in);

		
		
		int input=0;
		do {
			
			System.out.println("Entered number again: ");
			input = in.nextInt();
			
		}
		while (input%2==0);

	}

}
