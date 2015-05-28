import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for (int d=1;d<10;d++){
		 
		 TextIO.writeFile("src/Game");
	     TextIO.readFile("src/Game");
	   //  int l=TextIO.getInt();//
		
		for (int t=1;t<3;t++){
			System.out.printf("Player %d  	",t);
		int counter = 0;
          	System.out.println("LEVEL 1");
		for (int i = 1; i < 10; i++) {

			int a = (int) (Math.random() * 10 + 1);
			int b = (int) (Math.random() * 10 + 1);
			System.out.printf("Task is %d + %d =***",a,b);
			int c = a + b;
			System.out.println("\nEnter the result");
			Scanner input = new Scanner(System.in);
			int d = input.nextInt();
			if (d == c)
				counter++;

			if (counter == 5)
		
			
			break;
	/*	}
		System.out.println("LEVEL 2");
		for (int i = 1; i < 10; i++) {
			int a = (int) (Math.random() * 10 + 1);
			int b = (int) (Math.random() * 10 + 1);
			System.out.printf("Task is %d - %d =***",a,b);
			int c = a-b;
			System.out.println("\nEnter the result");
			Scanner input = new Scanner(System.in);
			int d = input.nextInt();
			if (d == c)
				counter++;
			
			if (counter ==10)
				break;
		}
		System.out.println("LEVEL 3");
		for (int i = 1; i < 10; i++) {
			int a = (int) (Math.random() * 10 + 1);
			int b = (int) (Math.random() * 10 + 1);
			System.out.printf("Task is %d * %d =***",a,b);
			int c = a * b;
			System.out.println("\nEnter the result");
			Scanner input = new Scanner(System.in);
			int d = input.nextInt();
			if (d == c)
				counter++;
			
			if (counter == 15)
				break;*/
		}
		
		
		System.out.printf("\nPlayer %d",t);
		System.out.print("\nEnter name\n ");
		String name=TextIO.getln();
	    System.out.printf("Result is %d\n",counter);
		// System.out.printf("Winner is player %d",t);	
		
	TextIO.putf("Player one %s with score %d\n",counter,name);
		}
	}
}
