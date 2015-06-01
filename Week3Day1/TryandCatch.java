import java.util.InputMismatchException;
import java.util.Scanner;

public class TryandCatch {
	
	// ispravi da radi, ubaci samo za jedan broj
	 public static int Method(int num){
		 Scanner input = new Scanner(System.in);
			
		 int num=0;
			
			// Unos korisnika sve dok ne unese broj
			while (true) {
				try {
				
				    num = input.nextInt();
					System.out.println(num);
					
					break;
				} catch (InputMismatchException e) {
					System.out.println("Error");
					System.out.println("Enter number again");
				   input.next();
				}
			}  return num;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=0;
	
			try {
				int num = input.nextInt();
				System.out.println(num);
				
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error");
				System.out.println("Enter number again");
				String num = input.next();
			}
               
			
			
		}

	}

}
