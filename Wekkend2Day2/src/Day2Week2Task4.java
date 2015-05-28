import java.util.Scanner;

public class Day2Week2Task4 {

	public static void main(String[] args) {

		// Task1 Unosi broj sve dok se ne ukuca paran broj

		Scanner in = new Scanner(System.in);
		int input = 0;
		int sum=0;
		int sum1=0;
		
		do {

			System.out.println("Entered number again: ");
			Scanner in = new Scanner(System.in);
			if (input%2!=0){
				sum+=1;}
				else
					sum1+=1;

		} while (input != 0);
		
		System.out.println(sum);
		
			
	System.out.println(sum1);
	

	}
}