package entities;

public class Student {

	public String name;
	public double quater1;
	public double quater2;
	public double quater3;
	
	public double total() {
		return quater1 + quater2 + quater3;
	}

	public double result() {
		if (total() < 60) {
			return 60.0 - total();
 		}
		else {
			return 0.0;
		}
		
	}
	
}
