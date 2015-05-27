import java.util.Scanner;


public class Task1W2D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner in = new Scanner(System.in);//
	
/*		//int max1 = in.nextInt();
	for (int i=0;i<=10;i++){
		System.out.println(i);
	}

	}
*/
/*
  for (int i=11;i<20;i++){
	  if(i%2!=0){
		  System.out.println(i);
	  }
  }}i
}*/  


		for(int i=100;i<999;i++){
			int var=0;
			for(int j=1;j<i;j++){
				if(i%j==0 && j!=i)
				
			      var+=j;
	}
			if (var==1)
				
				System.out.println(i);
			}
	
			
		}
		
		
			
			
		
		
}