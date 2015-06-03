import java.util.Scanner;


public class Task1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int num1=input.nextInt();
		System.out.println("Enter the number 2");
		int num2=input.nextInt();
		System.out.println("Enter the number 3");
		int num3=input.nextInt();
		
		int max=num1;
		if(num2>max)
		max=num2;
		if (num3>max)
			max=num3;
		System.out.println("Max number is: "+max);
      
	}

}

