import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
	public static int divide(int a, int b) {

		if (b == 0) {
			throw new ArithmeticException("Not 0");
		}

		return a / b;

	}

	public static void main(String[] args) throws ArithmeticException {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int num1 = 0;
		try {
			System.out.println("Unesi broj");
			num = in.nextInt();
			System.out.println("Unesi te broj s kojim zelite dijelit");
			num1 = in.nextInt();
			System.out.println(divide(num, num1));
		} catch (InputMismatchException e) {
			System.out.println((e.getMessage()));
			System.out.println("Not possible");
		} catch (ArithmeticException e1) {
			System.out.println("Dijeljenje nije proslo");
		} finally{
			System.out.println("Ovo je finally");
		}
		
		System.out.println("End of program");

	}

}
