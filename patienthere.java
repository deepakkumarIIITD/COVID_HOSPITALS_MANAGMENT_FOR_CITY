package ass1;

public class patienthere {
	public static int thereornot(String name, String age) {
		for (String key : maindataset.maindata.keySet()) {
			if (((maindataset.maindata.get(key))[0]).equals(name)) {
				if (((maindataset.maindata.get(key))[1]).equals(age)) {
					return 1;
				}
			}
		}
		return 2;
	}
}