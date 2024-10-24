import org.anudip.javaapp02.operation.TwoNonDecimalNumbersDivision;

public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersDivision division = new TwoNonDecimalNumbersDivision();

		
		System.out.println(division.divide(10, 2));
		System.out.println(division.divide(10, 3));
		System.out.println(division.divide(10, 4)); 
		System.out.println(division.divide(2, 10)); 
		System.out.println(division.divide(10, -2)); 
		System.out.println(division.divide(-10, 2)); 
		System.out.println(division.divide(-10, -2));
		System.out.println(division.divide(10, 0)); 
		System.out.println(division.divide(0, 2)); 
		System.out.println(division.divide(0, 0)); 
	}
}