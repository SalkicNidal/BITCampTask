import java.util.Scanner;



public class GameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pokusaj,brojPokusaja=0;
		int max=100;
		int X=(int)(Math.random()*max);
		System.out.print("Zamislio sam broj od 0 do"+max);
		Scanner ulaz=new Scanner(System.in);
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

}
