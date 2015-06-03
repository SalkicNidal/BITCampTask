package Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// Task1
		
	/*	int[] Array = new int[10];
		int num=Array.length;
		for(int i=0;i<num;i++){
		Array[i]=(int)(Math.random()*10+1);
		System.out.print( " "+Array[i] ); }
		System.out.print("\n"+Arrays.toString(Array));
	*/	
		// Task2
		
	/*	System.out.println("Enter the length of array");
		int num1=input.nextInt();
		int [] Array=new int[num1];
		int num2=0;
		for(int i=0;i<num1;i++){
			System.out.println("Enter the number of array");
			Array[i]= num2=input.nextInt();
		}
		for (int i=0;i<num1;i++){
			System.out.print(Array[i]+" ");}
		
	*/	
		
		// Task3
	/*	
		System.out.println("Enter the length of array");
		int num1=input.nextInt();
		int [] Array=new int[num1];
		int num2=0;
		for(int i=0;i<num1;i++){
			System.out.println("Enter the number of array");
			Array[i]= num2=input.nextInt();
		}
		int counter=0;
		  System.out.println("Enter the number");
		  int num=input.nextInt();
		  for(int i=0;i<num1;i++){
			  if(num==Array[i]){
				  counter++;
			  }
		  }
		//for (int i=0;i<num1;i++){
			//System.out.print(Array[i]+" ");}
		System.out.println(counter);
		*/
		
		//Task4
	/*	
	System.out.println("Enter one string");
		String s=input.nextLine();
		 
		int num1=s.length();
		
		char [] Array=new char[num1];
		for(int i=0;i<num1;i++){
			Array[i]=s.charAt(i);}
		char[] Array1=new char[num1];
		int counter=num1-1;
		for(int i=0;i<num1;i++){
			Array1[counter]=Array[i];
			counter--;
			
		}
		System.out.print(Array1);
		*/
		 //Task5
	/*
		int [] Array={2,4,3,2,1,4,5};
		int num1=Array.length*2;
		int[] Array1=new int[Array.length*2];
		Array1=Arrays.copyOf(Array, num1);
		System.out.println(Arrays.toString(Array1));
		
		*/
		
		
		
/*    //task6
			System.out.println("Enter the length");
			
			int num=input.nextInt();
			int[] Array=new int[num];
			
			for(int i=0;i<num;i++){
			System.out.println("Enter the index");
			 int num2 =input.nextInt();
			 System.out.println("Enter the value");
			int  num1=input.nextInt();
			  Array[num2]=num1;
			  System.out.print(Array);

			}
			
			
			*/
	// Task 7	
		
	/*	int []Array = {1,5,6,8,2,4};
		int []Array1 ={2,6,5};
		int num1=Array.length;
		int num2=Array1.length;
		int []Array2 =new int[num1+num2];
		for(int i=0;i<num1;i++){
			Array2[i]=Array[i];
		}
		int counter=0;
			for(int i=num1;i<num1+num2;i++){
				Array2[i]=Array1[counter];
				counter++;
			}
			System.out.println(Arrays.toString(Array2));
		      
		*/
	
	
			
		
		
		
		
	}
			
	

	}


