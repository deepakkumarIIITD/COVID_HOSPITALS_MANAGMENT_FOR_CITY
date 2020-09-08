package ass1;

public class patientsinaspecificinstitute {
	public static void patientininstitute(String hosp) {
		for (String key : maindataset.maindata.keySet()) {
			String[] datalist = maindataset.maindata.get(key);
			if (insideornot.insidedict(hosp)) {
				if ((datalist[6]).equals(hosp)) {
					System.out.println("PATIENT NAME : " + datalist[0] + " || RECOVERY TIME : " + datalist[5]);
				}
			}
		}
	}
}