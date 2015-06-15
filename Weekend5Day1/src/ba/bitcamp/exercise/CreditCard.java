package ba.bitcamp.exercise;

public class CreditCard {
	
	public Integer numberOfCard;
	public String bank;
	public Integer month;
	public Integer year;
	public Integer money;
	
	
	public CreditCard() {
		super();
		this.money = 0;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public Integer getMoney() {
		return money;
	}
	public void addMoney(Integer input) {
		this.money += input;
	}
	public void goneMoney(Integer input) {
		money -= input;

	}
	
	
}
