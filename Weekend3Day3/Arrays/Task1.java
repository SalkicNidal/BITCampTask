package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		int[] brojevi = new int[10];
		int index = 0;

		while (true) {

			Scanner input = new Scanner(System.in);
			System.out.println("Enter the numbers: ");
			int num1 = input.nextInt();
			if (num1 >= 0) {
				
				if (index < brojevi.length) {
					brojevi[index] = num1;
					index++;}
					else{
						for(int i=1;i<brojevi.length;i++){
					brojevi[i-1]=brojevi[i];
						}
					brojevi[brojevi.length -1]=num1;	
						
					}
				}else
				break;
			} 
		
		int max = -1;
		for (int i = 0; i < brojevi.length; i++) {
			int element = brojevi[i];
			if (element > max) {
				max = element;
			}

		}
		System.out.println(Arrays.toString(brojevi));
		for(int i=0;i<brojevi.length;i++){
			System.out.print(brojevi[i]+" ");
		}
		System.out.println("Max number of last ten is:" + max);

	}
}

/*
 * int tmp=0; int num=brojevi.length; for(int i=0;i<num;i++){
 * 
 * if(num1>0) brojevi[i]=num1; else{ break;} } int max=-1; for(int
 * i=0;i<num;i++){ int element=brojevi[i]; if(element>max){ max=element;
 */

// System.out.println(max);
/*
 * for(int j=0;j<num;j++){ tmp=brojevi[i]=(int)(Math.random()*10+1);
 * System.out.print(tmp+"	");} System.out.println();
 */

