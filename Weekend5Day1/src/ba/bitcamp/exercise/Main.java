package ba.bitcamp.exercise;

public class Main {

	public static void main(String[] args) {
		
		Wallet w = new Wallet(2);
		System.out.println(w.getHowMany());
		CreditCard c1 = new CreditCard();
		c1.addMoney(7900);
		System.out.println(c1.getMoney());
	}

}
