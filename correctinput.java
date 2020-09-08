package ass1;

import java.util.Scanner;

public class correctinput {
	public static void input() {
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER IN FORMAT : NAME TEMPRATURE OXYGEN AGE");
		String NAME = scn.next();
		String TEMPRATURE = scn.next();
		String OXYGEN = scn.next();
		String AGE = scn.next();
		if (patienthere.thereornot(NAME, AGE) == 2) {
			patient p = new patient(NAME, AGE, OXYGEN, TEMPRATURE);
		} else {
			System.out.println(
					"**ALERT**ALERT**ALERT**ALERT**    THIS PATIENT ALREADY EXIST    **ALERT**ALERT**ALERT**ALERT**");
		}
	}
}