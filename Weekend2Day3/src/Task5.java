
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=10000;i<=99999;i++){
		int	b=0;
		int c=i;
		for(int j=0;j<5;j++){
			b+=b%10;
			b=b*10;
			c=c/10;
		b=b/10;
		System.out.println(b);	
		if(b==i){
			int var=0;
			for (int z=1;z<b;z++){
				if(b%z==0 && z!=b){
					var+=1;}
					if (var==1){
						System.out.println(b);}
					}
					
				
			}
		}
		}
		

	}

}
