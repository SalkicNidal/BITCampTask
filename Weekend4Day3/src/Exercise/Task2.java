package Exercise;

public class Task2 {

	public static void main(String[] args) {
		
		TextIO.readFile("Matrix.txt");
		
		int column = TextIO.getInt();
		int row = TextIO.getInt();
		int Matrix[][]=new int[column][row];
		for(int i=0;i<Matrix.length;i++){
			for(int j=0;j<Matrix[i].length;j++){
				Matrix[i][j]=TextIO.getInt();
			}

		}
		
		array.print2D(Matrix);

		
		
		
		// TODO Auto-generated method stub

	}

}
