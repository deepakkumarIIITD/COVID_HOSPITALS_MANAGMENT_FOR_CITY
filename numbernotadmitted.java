package ass1;

public class numbernotadmitted {
	public static void notadmited() {
		int count = 0;
		for (String key : maindataset.maindata.keySet()) {
			String[] details = maindataset.maindata.get(key);
			if (details[4].equals("FALSE")) {
				count++;
			}
		}
		System.out.println("NUMBER OF PATIENTS STILL IN CAMP : "+count);
	}
}