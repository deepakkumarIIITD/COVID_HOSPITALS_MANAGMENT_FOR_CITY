package ass1;

import java.util.ArrayList;

public class removehosp {
	public static void removefilled() {
		ArrayList<String> selected = new ArrayList<>();
		for (String key : hospitaldata.hospitaldata.keySet()) {
			String[] datalist = hospitaldata.hospitaldata.get(key);
			if (datalist[3].equals("CLOSED")) {
				System.out.println("ACCOUNTS OF " + key + " ARE REMOVED");
				selected.add(key);
			}
		}
		connecter(selected);
	}

	public static void connecter(ArrayList<String> selected) {
		for (int i = 0; i < selected.size(); i++) {
			hospitaldata.hospitaldata.remove(selected.get(i));
		}
	}
}