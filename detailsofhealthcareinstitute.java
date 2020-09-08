package ass1;

public class detailsofhealthcareinstitute {
	public static void detailsofhosp(String hospname) {
		String[] details = hospitaldata.hospitaldata.get(hospname);
		System.out.println("INSTITUTE NAME : " + hospname);
		System.out.println("TEMPRATURE ELIGIBILITY : " + details[0]);
		System.out.println("OXYGEN ELIGIBILITY : " + details[1]);
		System.out.println("NUMBER OF AVAILABLE BEDS : " + details[2]);
		System.out.println("STATUS : " + details[3]);
	}
}