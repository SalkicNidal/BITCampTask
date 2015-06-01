import java.util.Scanner;


public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the web page plesae");
		
		System.out.print("http://");
		String a= "http://" + input.nextLine();
		 int num = a.length();
		 String web="";
		int  counter=0;
		 for (int i=num-1;i>=0;i--){
			 char c=a.charAt(i);
			 if (c!= '/'){
				 counter++;
			 }else
				 break;}
			
			for (int i=(num-1-(counter+1));i>=7;i--){
				char b=a.charAt(i);
				web+=b;
			}
		String res="";
		int num1=web.length();
		for (int i=num1-1;i>=0;i--){
			char d=web.charAt(i);
			res+=d;	  }
				 	System.out.println(res);
 
		 
		
	}

}
