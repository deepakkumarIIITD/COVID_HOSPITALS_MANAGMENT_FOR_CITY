package ass1;

import java.util.Scanner;

public class hospital {
	public static String hospitalname;
	public static String tempcriteria;
	public static String oxygcriteria;
	public static int numberofbeds;
	public static String status = "OPEN";

	hospital(String HOSPITAL, String TEMPCRITERIA, String OXYGCRITERIA, String NUMBERBED) {
		this.hospitalname = HOSPITAL;
		this.tempcriteria = TEMPCRITERIA;
		this.oxygcriteria = OXYGCRITERIA;
		this.numberofbeds = Integer.parseInt(NUMBERBED);
		dataadder();
		displayer();
		hospitaldataadder();
	}

	public static void dataadder() {
		Scanner scn = new Scanner(System.in);
		int oxygentopass = Integer.parseInt(oxygcriteria);
		for (String key : maindataset.maindata.keySet()) {
			String[] patientdata = maindataset.maindata.get(key);
			if (numberofbeds > 0) {
				if (patientdata[4].equals("FALSE")) {
					int patientoxygen = Integer.parseInt(patientdata[2]);
					if (patientoxygen >= oxygentopass) {
						numberofbeds = numberofbeds - 1;
						System.out.println("ENTER THE NUMBER OF DAYS IN WHICH PATIENT " + key + " WILL RECOVER");
						String recoverment = Integer.toString(scn.nextInt());
						patientdata[4] = "TRUE";
						patientdata[5] = recoverment;
						patientdata[6] = hospitalname;
					}
					maindataset.maindata.replace(key, patientdata);
				}
			}
		}
		if (numberofbeds > 0) {
			for (String key : maindataset.maindata.keySet()) {
				String[] patientdata = maindataset.maindata.get(key);
				float tempraturetopass = Float.parseFloat(tempcriteria);
				if (patientdata[4].equals("FALSE")) {
					float patienttemprature = Float.parseFloat(patientdata[3]);
					if (patienttemprature <= tempraturetopass) {
						numberofbeds = numberofbeds - 1;
						System.out.println("ENTER THE NUMBER OF DAYS IN WHICH PATIENT " + key + " WILL RECOVER");
						String recoverment = Integer.toString(scn.nextInt());
						patientdata[4] = "TRUE";
						patientdata[5] = recoverment;
						patientdata[6] = hospitalname;
					}
					maindataset.maindata.replace(key, patientdata);
				}
			}
			if (numberofbeds > 0) {
				status = "OPEN";
			} else {
				status = "CLOSED";
			}
		} else {
			status = "CLOSED";
		}
	}

	public static void displayer() {
		System.out.println("INSTITUTE NAME : " + hospitalname);
		System.out.println("TEMPRATURE ELIGIBILITY : " + tempcriteria);
		System.out.println("OXYGEN ELIGIBILITY : " + oxygcriteria);
		System.out.println("NUMBER OF AVAILABLE BEDS : " + numberofbeds);
		System.out.println("STATUS : " + status);
		System.out.println("    PATIENTS IN " + hospitalname + " WITH THEIR RECOVERY DATES :");
		for (String key : maindataset.maindata.keySet()) {
			String[] pat = maindataset.maindata.get(key);
			if (pat[6].equals(hospitalname)) {
				System.out.println("        PATIENT ID : " + key + " ||  RECOVERY DATE : " + pat[5]);
			}
		}
	}

	public static void hospitaldataadder() {
		String[] hospitalcredentials = { tempcriteria, oxygcriteria, Integer.toString(numberofbeds), status };
		hospitaldata.hospitaldata.put(hospitalname, hospitalcredentials);
	}

	public static String getHospitalname() {
		return hospitalname;
	}

	public static String getTempcriteria() {
		return tempcriteria;
	}

	public static String getOxygcriteria() {
		return oxygcriteria;
	}

	public static int getNumberofbeds() {
		return numberofbeds;
	}

	public static String getStatus() {
		return status;
	}
}