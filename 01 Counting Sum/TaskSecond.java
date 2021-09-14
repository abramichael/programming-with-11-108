import java.util.Scanner;

public class TaskSecond {
	
	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		
		int s = 0;
		
		int i = 1;
		while (i <= n) {
			int a = sc.nextInt();
			s = s + a; 				// s += a
			i += 1; 				// i = i + 1 // i++ // ++i
		}
		System.out.println("Sum is " + s);
		
	}
	
}