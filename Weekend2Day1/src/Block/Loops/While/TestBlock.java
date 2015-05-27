package Block.Loops.While;

import java.io.InputStream;
import java.util.Scanner;

public class TestBlock {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub int mainInt=10; if(mainInt>0){
		 * mainInt-=0; int maininit=4; int ifInt=2;
		 * System.out.println("ifInt from if: " + ifInt);
		 * System.out.println("maininit from if:" +maininit); }
		 * System.out.println("nainInt from main :" + mainInt);
		 */

		/*
Task1		 * // Sum of first 100 number
		 * 
		 * int num = 100; int num1 = 1; int suma=0; while (num1 <= num) {
		 * suma+=num1; num1++; System.out.println(suma); }
		 * System.out.println("Finishing");
		 */

	/*
Task2		// do while random meters input, and print coma after 1000 meters
		int meters = 41150;
		double passmeters = 0;
		int num1=0;
		int player1 = 45;
		do {
			passmeters += Math.random();
			num1++;
			if ((int) num1%1000 == 0) {
				System.out.println(".");

			}
			System.out.println(num1);
		}

		while (passmeters < meters);

		System.out.println("You are finished the marathon");
*/      
/*Task3		// Igrica pogadjanja broja
		
		int pokusaj,brojPokusaja=0;
		int max=100;
		int X=(int)(Math.random()*max);
		System.out.print("Zamislio sam broj od 0 do"+max);
		Scanner ulaz=newScanner(System.in);
		int num1;
		
		do {
			brojPokusaja++;
			num1=ulaz.nextInt();
			if(num1==X){
			System.out.println("Succes");
		}
			else if (num1>X){
				System.out.println("Your number is hager");
				
			}
			else if (num1<X){
				System.out.println("Your number is lowest");
				
			}
				
		}
		while  (num1!=X);
		
		
	}

	private static Scanner newScanner(InputStream in) {
		// TODO Auto-generated method stub
		return null; */
		
		
//Task4  brake in while loop
		
       int maxbroj=100;
		int sum=0;
		
		int broj=1;
		while (broj<maxbroj){
			broj++;
			sum+=broj;
			
			if(sum>maxbroj){
				break;
			}
			System.out.println(sum);
			
			}   
			
		
		
		}
	}
	
	
	


