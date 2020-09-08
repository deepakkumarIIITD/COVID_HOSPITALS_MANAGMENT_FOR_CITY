package ass1;

import java.util.HashMap;

public class removeaddmpat {
	public static void removeadmited() {
		for (String key : maindataset.maindata.keySet()) {
			String[] details = maindataset.maindata.get(key);
			if (details[4].equals("TRUE")) {
				if (details[7].equals("FALSE")) {
					System.out.println("PATIENT WITH ID "+key+" HAS BEEN REMOVED");
					details[7] = "TRUE";
					maindataset.maindata.replace(key, details);
				}
			}
		}
	}
}