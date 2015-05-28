
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TextIO.readFile("src/Text.txt");
          int a=TextIO.getInt();
      int   sum=0;
          for (int i=1;i<=a;i++){
        	  int b =TextIO.getInt();
        	 sum+=b;
        	
          }
         System.out.println(sum);
	}

}
