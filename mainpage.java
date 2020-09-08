package ass1;

import java.awt.print.Paper;
import java.util.Scanner;

public class mainpage {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER NUMBER OF PATIENTS TO ADD");
		int number_of_patients = scn.nextInt();
		for (int i = 0; i < number_of_patients; i++) {
			correctinput.input();
		}
		while (true) {
			printo.printoped();
			int function = scn.nextInt();
			if (function == 1) {
				addingnewhospitalc1.addhospnew();
			} else if (function == 2) {
				removeaddmpat.removeadmited();
			} else if (function == 3) {
				removehosp.removefilled();
			} else if (function == 4) {
				numbernotadmitted.notadmited();
			} else if (function == 5) {
				hospopen.openhosps();
			} else if (function == 6) {
				System.out.println("ENTER INSTITUTION NAME");
				String insname = scn.next();
				detailsofhealthcareinstitute.detailsofhosp(insname);
			} else if (function == 7) {
				System.out.println("ENTER ID OF PATIENT");
				String idpatien = scn.next();
				detailsofparticularpatient.detailsofpatient(idpatien);
			} else if (function == 8) {
				maindataset.displayallpatients();
			} else if (function == 9) {
				System.out.println("ENTER INSTITUTION NAME");
				String insname = scn.next();
				patientsinaspecificinstitute.patientininstitute(insname);
			} else if (function == 10) {
				break;
			}
		}
	}
}