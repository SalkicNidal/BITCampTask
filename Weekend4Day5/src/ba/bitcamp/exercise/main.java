package ba.bitcamp.exercise;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
	
		University u1 = new University();
		u1.name = "UNSA";
		u1.city = "Sarajevo";
		u1.yearOfConstruction = 1944;

		u1.faculties = new Faculty[3];
		u1.faculties[0] = new Faculty();
		u1.faculties[0].name = "Pravni fakultet";
		u1.faculties[0].isBologna = true;
		u1.faculties[0].departments= new String[2];
		u1.faculties[0].departments[0] = "Krivicno pravo";
		u1.faculties[0].departments[1] = "Notarski";
		
		u1.faculties[1] = new Faculty();
		u1.faculties[1].name = "Elektrotehnicki";
		u1.faculties[1].isBologna = true;
		u1.faculties[1].departments = new String [2];
		u1.faculties[1].departments[0] = "Telekomunikacije";
		u1.faculties[1].departments[1] = "Elektroenergetika";
		
		System.out.println(u1);
		System.out.println();
		System.out.println(u1.faculties[0]);
		
	
	}

}
