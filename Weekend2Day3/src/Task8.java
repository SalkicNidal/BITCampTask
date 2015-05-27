public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10000000; i <99999999; i++) {
		
			if (i % 2 == 0) {
				int sum = 0;
				for (int j = 1; j <= i/2; j++) {
					if (i % j == 0 && j != i){
						sum += j;
						
					if (sum>i)
						break;
					}
						}
				 if (sum == i) 
						System.out.println(i);
				
				
			}
		}

	}

}
