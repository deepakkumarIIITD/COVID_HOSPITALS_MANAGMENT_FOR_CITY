package ass1;

public class hospopen {
	public static void openhosps() {
		int counter = 0;
		for (String key : hospitaldata.hospitaldata.keySet()) {
			String[] details = hospitaldata.hospitaldata.get(key);
			if (details[3].equals("OPEN")) {
				counter++;
				System.out.println("INSTITUTE NAME : " + key);
				System.out.println("TEMPRATURE ELIGIBILITY : " + details[0]);
				System.out.println("OXYGEN ELIGIBILITY : " + details[1]);
				System.out.println("NUMBER OF AVAILABLE BEDS : " + details[2]);
			}
		}
		if (counter == 0) {
			System.out.println("NO HOSPITAL IS OPEN");
		}
	}
}