package ass1;

import java.util.HashMap;

public class maindataset {
	public static HashMap<String, String[]> maindata = new HashMap<String, String[]>();

	public static void displayallpatients() {
		display();
	}

	private static void display() {
		for (String key : maindata.keySet()) {
			if ((maindata.get(key))[4].equals("FALSE")) {
				System.out.println("PATIENT NAME : " + (maindata.get(key))[0] + " || PATIENT ID : " + key);
			}
		}
	}
}