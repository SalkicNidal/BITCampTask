import java.util.Scanner;


public class Task2 {
	public static void main(String[] args) {
		Scanner  input =new Scanner(System.in);
		System.out.println("Enter the number of maters");
		int num=input.nextInt();
		System.out.println("Enter the number f containrs");
		int num1=input.nextInt();
		
		int counter=0;
		int counter1=0;
		if (num%2!=0){
				num++;
				counter1++;}
		else{

			int sum=num;	
		    while(num%2==0){
			sum/=2;
			if (sum==num1){
		
			break;}
		    } 
			
		}   
		
	System.out.println(counter1);
	}
}
