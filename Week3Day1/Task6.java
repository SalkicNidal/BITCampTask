import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String izraz = in.nextLine();
		int num1 = izraz.length();
		int counter = 0;
		String a = "";
		String d = "";
		int num4 = izraz.indexOf('+');
		int num5 = izraz.indexOf('-');
		
		if (num4 > -1) {
			for (int i = 0; i < num4; i++) {
				char b = izraz.charAt(i);
				a = a + b;

			}

			int num = Integer.parseInt(a);
			for (int i = num4 + 1; i < num1; i++) {
				char b = izraz.charAt(i);
				d = d + b;
			}

			int num2 = Integer.parseInt(d);
			int res = num + num2;

			System.out.printf("Result is:",res);
		} else if (num5 > -1) {
			for (int i = 0; i < num5; i++) {
				char b = izraz.charAt(i);
				a = a + b;

			}

			int num = Integer.parseInt(a);
			for (int i = num5 + 1; i < num1; i++) {
				char b = izraz.charAt(i);
				d = d + b;
			}

			int num2 = Integer.parseInt(d);
			int res = num - num2;

			System.out.printf("Result is:",res);
		}

	}
}