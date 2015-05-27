package IF.opertors;

public class Task6 {

	public static void main(String[] args) {

		int year = 2021;
		boolean leep;
		if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {

			System.out.println("Year is leef year");
			leep = true;
		} else {
			System.out.println("Year is no leep year");
			leep = false;
		}
		int day = 29;
		int month = 2;
		int year1 = 2016;

		if (day == 31 && month == 12) {
			int year2 = year1 + 1;
			System.out.printf("01.01.%d", year2);
		} else if (month == 1 || month == 3 || month == 5 || month == 7
				|| month == 8 || month == 10 || month == 12) {
			if (day == 31) {
				int month1 = month + 1;
				int day1 = 1;
				int year3 = year1;
				System.out.printf("%d-%d-%d", day1, month1, year3);
			} else {
				int day3 = day + 1;
				int month3 = month;
				int year4 = year1;
				System.out.printf("%d-%d-%d", day3, month3, year4);
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day == 30) {
				int month3 = month + 1;
				int day1 = 1;
				int year3 = year1;
				System.out.printf("%d-%d-%d", day1, month3, year3);
			} else {
				int day3 = day + 1;
				int month3 = month;
				int year4 = year1;
				System.out.printf("%d-%d-%d", day3, month3, year4);
			}

			if (leep == true && day == 28) {
				int year3 = year;
				int day1 = day + 1;
				int month1 = month;
				System.out.printf("%d-%d-%d", day1, month1, year3);
			} else {
				int day3 = 1;
				int month3 = month + 1;
				int year4 = year1;
				System.out.printf("%d-%d-%d", day3, month3, year4);

			}

		}
	}

}
