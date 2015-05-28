import java.util.Scanner;


public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //      int a=TextIO.getInt();//
      
         Scanner input=new Scanner(System.in);
         int b=input.nextInt();
         int a=input.nextInt();
     System.out.println("* | ");
     for(int i=1;i<b;i++){
    	 System.out.print(i +"	");
     }
     System.out.println();
     System.out.println("-  -  -  -  -  -  -  -  -  -  -");
     
         for(int i=1;i<b;i++){
        	 for(int j=1;j<a;j++){
        	  System.out.printf("%2d	",i*j);
        	   
         
        	 }	 
        	System.out.println();
         }}

}
