import java.util.Scanner;


public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int	p=0;
		for (int i=1;i<=10;i++){
			if (i<4 || i==8 || i==10){
				if (i==1)
				p=2;
					else if (i==2)
						p=3;
					else if (i==3)
						p=5;
					else if (i==4)
						p=7;
					else if (i==8)
						p=13;
					else if (i==10)
						p=17;
			
		
	
		
		
		double perfect1	=Math.pow(2, p-1);
		double perfect2=(Math.pow(2, p));
		int perfect= (int)( perfect1*(perfect2-1));
		System.out.println(perfect);
		}
		
		
			
		}
	}

}
