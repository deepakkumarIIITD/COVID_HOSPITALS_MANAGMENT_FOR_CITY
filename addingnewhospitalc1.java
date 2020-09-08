package ass1;

import java.util.Scanner;

public class addingnewhospitalc1 {
	public static void addhospnew() {
		Scanner scn = new Scanner(System.in);
		System.out.println(
				"ENTER HEALTH CARE INSTITUTE IN FORMAT : NAME TEMPRATURE-CRITERIA OXYGEN-CRITERIA NUMBER-OF-BEDS");
		String NAMEHOSP = scn.next();
		String TEMPRATUREHOSP = scn.next();
		String OXYGENHOSP = scn.next();
		String NUMBBEDHOSP = scn.next();
		hospital newhosp = new hospital(NAMEHOSP, TEMPRATUREHOSP, OXYGENHOSP, NUMBBEDHOSP);
	}
}