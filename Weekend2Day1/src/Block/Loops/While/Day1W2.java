package Block.Loops.While;

public class Day1W2 {
	public static void main(String[] args) {

		/*
		 * // Task 1
		 * 
		 * int n=3; int n1=0;
		 * 
		 * 
		 * while(n1<n){ System.out.println("*"); n--;
		 * 
		 * 
		 * // Task2
		 * 
		 * int day=15; int month=4; int year=1993;
		 * 
		 * int sum = 0; int month1=5; int year1=2015;
		 * 
		 * while (year<2015){ sum+=1; year++;} if(month<5){ sum=sum+1 ; }
		 * System.out.println(sum);
		 * 
		 * } }
		 */

		/*
		 * // Task3
		 * 
		 * int num=100; int num1=1; int sum=0; while (num1<num){ sum+=num1;
		 * num1++; System.out.println(sum); }
		 * 
		 * 
		 * } }
		 */
		// Task 4

		/*
		 * int num = 5; int num1 = 1; int res = 1;
		 * 
		 * while (num1 <= num) { res *= num1; num1++; } System.out.println(res);
		 */

		/*
		 * task5
		 * 
		 * 
		 * int num = 24; int num1 = 1; int res = 0;
		 * 
		 * while (num1 <= num) {
		 * 
		 * if (num1 % 3 == 0 && num1 % 5 != 0) { System.out.println(num1); }
		 * num1++; }
		 * 
		 * }
		 * 
		 * }
		 */
		/*
		 * Task6
		 * 
		 * int num=3215; int num1=0;
		 * 
		 * while (num!=0){ num1++; num=num/10;} System.out.println(num1);
		 * 
		 * } } // Task7 /* int num = 323; int num1; int num2; int num3; int
		 * num4;
		 * 
		 * num1 = num % 10; num4= num/10; num2 = num1 * 10 + num4 % 10; num3 =
		 * num2 * 10 + (num / 100);
		 * 
		 * System.out.println(num3); System.out.println(num); if (num3 == num) {
		 * System.out.println("Numberis palindrome"); } }
		 */
		/*
		 * int num = ; int num1=0; int num2 = 0; int help=num; while (num > 0) {
		 * num1 = num % 10; num =num/10; num2 +=num1 ; num2*=10;} // num2/=10;
		 * 
		 * 
		 * // if (help== num2) { System.out.println("Number is palindrome");} //
		 * else System.out.println("Number is not palindrome");
		 * 
		 * }
		 * 
		 * }
		 */
		/*
		 * 
		 * Task8 int num = 7; int num1 = 0; int h = 0;
		 * 
		 * while (num1 < num) { num1++; boolean djeljiv = (num % num1 == 0); if
		 * (djeljiv == true) { h++; } } if (h == 2) {
		 * System.out.println("Prost"); } else System.out.println("Nije prost");
		 * 
		 * }
		 * 
		 * }
		 */
/*
		int num = 10001;
		int max = 99999;
		int num1 = 0;
		int num2 = 0;
		int help = num;
		while (help < max) {
			
			num=help;
			while (num > 0) {
			
				num1 = num % 10;
				num = num / 10;
				num2 += num1;
				num2 *= 10;
			}
			num2/=10;
			if (help == num2) {
				System.out.println(num2);}
		
			help++;
			num2=0;
			}
			
			}
			
		

	*/
}
