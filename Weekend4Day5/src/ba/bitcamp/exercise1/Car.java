package ba.bitcamp.exercise1;

import java.awt.Color;

public class Car {
	
	String type;
	Color color;
	Integer power;
	Integer year;
	
	public Car(String type, Color color, Integer power, Integer year) {
		super();
		this.type = type;
		this.color = color;
		this.power = power;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [type= " + type + ", color= " + color + ", power= " + power
				+ ", year= " + year + "]";
	}
	

}
