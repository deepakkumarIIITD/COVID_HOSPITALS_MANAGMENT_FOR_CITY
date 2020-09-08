package ass1;

import java.util.HashMap;
import ass1.maindataset;
import ass1.currentnum;

public class patient {
	public static String name;
	public static String age;
	public static String oxygen;
	public static String temprature;
	public static String ID;

	patient(String NAME, String AGE, String OXYGEN, String TEMPRATURE) {
		this.name = NAME;
		this.age = AGE;
		this.oxygen = OXYGEN;
		this.temprature = TEMPRATURE;
		this.ID = idmaker();
		mapmaker();
	}

	public static String idmaker() {
		String id = name + age + oxygen + currentnum.currentnumber;
		currentnum.currentnumber = currentnum.currentnumber + 1;
		return id;
	}

	public static void mapmaker() {
		String hospital = "";
		String admittedornot = "FALSE";
		String recoverydays = "";
		String removed = "FALSE";
		String[] datalist = { name, age, oxygen, temprature, admittedornot, recoverydays, hospital, removed };
		maindataset.maindata.put(ID, datalist);
	}

	public static String getName() {
		return name;
	}

	public static String getAge() {
		return age;
	}

	public static String getOxygen() {
		return oxygen;
	}

	public static String getTemprature() {
		return temprature;
	}

	public static String getID() {
		return ID;
	}
}