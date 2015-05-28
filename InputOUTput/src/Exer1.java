import java.util.Scanner;


public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner in=new Scanner(System.in);
  
 /* String name= in.next();
  System.out.printf("Hello %s nice to meet you",name);*/
  System.out.println("Sve po marku nemere u teku");
   double var= in.nextDouble();
   double  var2=in.nextDouble();
   double var3=0;
           var3=var2-var;
           
          if(var3<0){
        	  TextIO.writeUserSelectedFile();
        	  TextIO.putln("Osto duzan            " + var3); 
        	
        
     

        /* Print a final message to standard output. */

        TextIO.writeStandardOutput();
        TextIO.putln("Thank you.  Your profile has been written to teka.txt.");
          }
           else 
       
		
        	 System.out.println("Kusur je "+var3);
        
        		
         }
  
	

}
