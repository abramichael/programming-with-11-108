/**
	Task2: convert n in 10-counting system to x in k- counting system
*/

public class Task2 {
	public static void main(String [] args) {
		int k = 6;
		long n = 32345678L;
		// поиск-максимальной степени
		long b = 1L;
		int maxDeg = 0;
		long place = 1;
		while (b <= n) {
			b = b * k;
			maxDeg += 1; 
			place *= 10;
		}
		b = b / k;
		maxDeg -= 1;
		place /= 10;
		System.out.println(maxDeg);
		System.out.println(b);
		
		// результат
		long x = 0;
		for (int i = maxDeg; i >= 0 && n > 0; i--) {
			System.out.println("Counting digit for position: " + i);
			// поиск максимальной цифры при текущей степени
			int d = 1;
			while (d * b <= n) {
				d = d + 1;
			}
			d = d - 1;
			System.out.println("Digit found: " + d);
			// накопить/сохранить получившуюся часть
			x = x + place * d;
			System.out.println("Current number: " + x);
			// перейти к числу n - накопленное
			n = n - b * d;
			// уменьшаю разрядность
			b = b / k;
			place = place / 10;
		}
	}
}