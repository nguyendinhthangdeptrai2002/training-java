package training.java.ds;

public class Test {

	public static void main(String[] args) {
		

		test1();
	}
	static void test1() {
		int so = 5434535;
		System.err.printf("%,d",so);
//		System.err.println(++so);
	String message = "i";
		message +=" love";
		message +="java";
		System.out.println(message);
	
	String[] mang = {"d","a","r"};
		System.out.println(mang[0]);
		double[] result= new double[mang.length];
		for(String hihi : mang) {
			System.out.println( hihi);
		}
	}
	static void Stringbuider() {
		String location = " ha tinh ";
		 int flightnumber =175; 
		 StringBuilder  sb = new StringBuilder(40);
		 sb.append("l feel to");
		 sb.append(location);
		 sb.append(" on flight #");
		 sb.append(flightnumber);
		 
		 // chen vao theo vi tri mong muon 
		 String time = "9:00";
		 int pos = sb.indexOf(" on");
		 sb.insert(pos, " at ");
		 sb.insert(pos +4, time);
		 
		 String message = sb.toString();
		 System.out.println(message);
		 
	}
}
