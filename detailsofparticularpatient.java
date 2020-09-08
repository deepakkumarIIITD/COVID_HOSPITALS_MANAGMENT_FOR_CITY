package ass1;

public class detailsofparticularpatient {
	public static void detailsofpatient(String id) {
		String[] listofdata = maindataset.maindata.get(id);
		System.out.println("ID : " + id);
		System.out.println("TEMPERATURE : " + listofdata[3]);
		System.out.println("OXYGEN LEVELS : " + listofdata[2]);
		if ((listofdata[6]).equals("")) {
			System.out.println("ADMISSION STATUS : " + listofdata[4]);
		} else {
			System.out.println("ADMISSION STATUS : " + listofdata[4]);
			System.out.println("HEALTH CARE INSTITUTE : " + listofdata[6]);
		}
	}
}