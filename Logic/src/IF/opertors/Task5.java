package IF.opertors;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 22;
		int month = 5;

		int day1 = 1;
		int month2 = 8;

		if (month2 < month) {
			System.out.println("Sorry your birthday is pass");
		} else if (month2 > month) {
			System.out.printf("Your birthday is on %d -%d-2015",day1,month2);
		} else if (day == day1) {
			System.out.println("Happy Birthday");

		}
	}

}
      
