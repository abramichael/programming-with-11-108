public class TaskSecondVer2 {
	
	public static void main(String [] args) {
		
		int n = args.length;
		int s = 0;
		int i = 0;
		while (i < n) {
			int a = Integer.parseInt(args[i]);
			s = s + a; 				// s += a
			i += 1; 				// i = i + 1 // i++ // ++i
		}
		System.out.println("Sum is " + s);
		
	}
	
}