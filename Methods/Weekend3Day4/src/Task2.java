public class Task2 {
	public static int getMax(int num1, int num2) {
		int max = 0;
		if (num1 > num2)
			max = num1;
		else
			max = num2;
		return max;
	}

	public static String getExtension(String file) {

		String extension = "";

		int pleace = file.indexOf('.');
		if (pleace == -1) {
			return null;
		} else {
			int num1 = file.length();
			int counter = 0;
			for (int i = num1 - 1; i > 0; i--) {
				char c = file.charAt(i);
				if (c == '.')
					break;
				else
					extension = c + extension;
			}
		}
		return "." + extension;
	}

	public static Boolean canBeBinary(int num) {
		boolean result = true;
		if (num < 0)
			result = false;
		while (num > 0) {
			int sum = num % 10;
			if (sum == 0 || sum == 1) {
				num /= 10;
				result = true;
			} else
				result = false;
			break;
		}

		return result;
	}

	public static int getRandomNumber(int num1, int num2) {

		if (num1 > num2)
			return -1;
		else

			return ((int) (Math.random() * (num2 - num1 + 1)) + (num1));

	}

	public static String getType(String test) {

		String result = "";

		try {
			int a = Integer.parseInt(test);
			result = "Integer";
		} catch (Exception e) {
			try {
				double d = Double.parseDouble(test);
				result = "Double";
			} catch (Exception g) {
				int s = test.length();
				if (s < 2)
					result = "Char";
				else if (test.equals("true") || test.equals("false"))
					result = "Boolean";
				else
					result = "String";

			}
		}

		return result;
	}

	public static String fixSentence(String line) {

		String text = "";
		String text2 = "";
		char first = line.charAt(0);
		text = first + text;
		String text1 = text.toUpperCase();

		int pleace = line.indexOf('.');
		if (pleace == -1) {
			for (int i = 1; i < line.length(); i++) {
				char d = line.charAt(i);
				text2 = text2 + d;

				text = text1 + text2 + ".";
			}
		} else {
			for (int i = 1; i < line.length(); i++) {
				char d = line.charAt(i);
				text2 = text2 + d;
				text = text1 + text2;
			}
		}

		return text;
	}

	public static void main(String[] args) {

		/*
		 * int a = 98; int b = 98; int max1 = getMax(a, b);
		 * System.out.println(max1);
		 * 
		 * String file = "text.txtfrrewre"; String extension =
		 * getExtension(file); System.out.println("." + extension);
		 * 
		 * int num = 100; boolean check = canBeBinary(num);
		 * System.out.println(check);
		 * 
		 * int min = 6; int max = 5; int rang = getRandomNumber(min, max);
		 * System.out.println(rang);
		*/ 
		// String test = "5"; String res = getType(test);
		//  System.out.println(res);
		/* * 
		 * String line = "Nidal"; String test1 = fixSentence(line);
		 * System.out.println(test1);
		 */

		String line = "danas je bio divan dan";
		String file = "Ssveska";
		String onako = "true";
		int num = 52;

		String line1 = fixSentence(line);
		
		if (getExtension(file)==null) {
			file += ".txt";
			System.out.println(file);
		} else
			System.out.println("The file have extension");
		
		if(getType(onako)=="Boolean"){
			TextIO.writeFile(file);
			if(canBeBinary(num)==true){
				TextIO.putln(num);
			}
			else{
				TextIO.putln(getRandomNumber(num/2, num));
			}
		}
			else if(getType(onako)=="Integer"){
				TextIO.writeFile(file);
				if(canBeBinary(num)==true){
					TextIO.putln(num);
				}
				else{
					int num2=Integer.parseInt(onako);
					TextIO.putln(getMax(num, num2));
				}
				}
			    else if (getType(onako)=="String"){
			    	TextIO.writeFile(file);
				int p=getRandomNumber(1, num);
				for(int i=1;i<=p;i++){
					TextIO.putln(onako);
				}
				String file2="";
				 file2= onako+ ".txt";
				 TextIO.writeFile(file2);
				 TextIO.putln(line);
				
		}
	}

}
