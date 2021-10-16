/**
	Task1: convert x in k- counting system to n in 10-counting system
*/

public class Task1 {
	public static void main(String [] arsg) {
		int k = 5;
		long x = 44444L;
		long n = 0L;
		long b = 1L;
		while (x > 0) {
			// getting last number
			long d = x % 10;
			// adding to n
			n = n + b * d;
			// increasing the place
			b = b * k;		
			// drop last number
			x = x / 10;
		}
		System.out.println(n);
	}
}