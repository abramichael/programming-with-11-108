public class PrintUpperTriangle {
	
	public static void main(String [] args) {
		
		int n = Integer.parseInt(args[0]);
		
		int i = 0; 
		
		while (i < n) {
			
			// вывести i пробелов
			int j = 1;
			while (j <= i) {
				System.out.print(" ");
				j += 1;
			}
			
			// вывести n-i *
			j = 1;
			while (j <= n - i) {
				System.out.print("*");
				j += 1;
			}
			
			System.out.println();
			
			i += 1;
			
		}
		
	}
}