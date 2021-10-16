/**
	Task2: convert n in 10-counting system to x in k- counting system
*/

public class Task2Ver2 {
	public static void main(String [] args) {
		int k = 5;
		long n = 306;
		long place = 1;
		long x = 0;
		
		
		while (n > 0) {
			long d = n % k;
			x = x + place * d;
			place *= 10;
			n = n / k;
			System.out.println(x);
		}

	}
}