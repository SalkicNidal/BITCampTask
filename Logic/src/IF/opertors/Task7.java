package IF.opertors;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 9;
		double c = 1;
		double D = Math.sqrt(b * b - 4 * a * c);
		if (D < 0) {
			System.out.println("Solutions are not realistic");

		} else {
			double x1 = (-b + D) / 2 * a;
			double x2 = (-b - D) / 2 * a;
			System.out.printf("Solution1 is%.2f Solution2 is%.2f", x1, x2);
		}

	}
}
