public class Task1 {

	public static void main(String[] args) {
		
		// Princip rada mjesanja karata, dovrsiti treba i doraditi
		
		
		int karte[] = new int[52];
		for (int i = 1; i < 53; i++) {
			karte[i - 1] = i;
		}

		for (int i = 0; i < karte.length; i++) {
			System.out.print(karte[i] + " ");
		}
		for (int brojmjesanja = 0; brojmjesanja < 10; brojmjesanja++) {
			for (int brojzamjena = 0; brojzamjena < 15; brojzamjena++) {
				int index1 = (int) (Math.random() * 52);
				int index2 = (int) (Math.random() * 52);
				int tmp = karte[index1];
				karte[index1] = karte[index2];
				karte[index2] = tmp;

			}
			for (int i = 0; i < karte.length; i++) {
				int znak=karte[i]/13;
				int broj=karte[i]%13;
				String znak1=null;
				switch(znak){
				case 0:
					znak1="S";
					break;
				case 1:
					znak1="L";
					break;
				case 3:
					znak1="B";
					break;
				
				}
				System.out.print(broj+znak + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(karte[i] + " ");
		}
		int karte1[] = new int[48];
		for (int i = 4; i < karte.length; i++) {
			karte1[i - 4] = karte[i];
		}
		karte = karte1;
		
		for (int i = 0; i < karte.length; i++) {
			
			System.out.print(karte[i] + " ");
		}
	}

}
