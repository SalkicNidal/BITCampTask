
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Ispis Cetverocifrenih polindroma
		
		
		int sum=0;
		int counter1=0;
		int b=0;
		for(int i=1000;i<=9999;i++){
			b=0;
		int	c=i;
			for(int j=0;j<4;j++){
				b+=c%10;
			    b=b*10;
			    c=c/10; 
			}
			b/=10;
			if (b==i)
			    System.out.println(b);
			
		}
		
	}
		
		
		
}	
		
	
	
	
	


