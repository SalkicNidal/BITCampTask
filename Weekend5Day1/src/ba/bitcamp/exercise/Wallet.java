package ba.bitcamp.exercise;


public class Wallet {
	
	Integer howMoney;
	CreditCard[] cards;
	Integer max;
	
	
	public Wallet(Integer max) {
		super();
		this.max = max;
		this.cards = new CreditCard[max];
	}

	public Integer getHowMany() {
		return howMoney;
	}

	public void addMany(Integer money) {
		this.howMoney += money;
	}
	
	public void loseMany(Integer money) {
		this.howMoney -= money;
	
	}
	public void getCard(CreditCard c){
		for(int i = 0; i < cards.length; i++){
			if
		}
		
		
	}
	
}
