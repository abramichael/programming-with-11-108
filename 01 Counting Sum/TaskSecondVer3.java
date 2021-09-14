public class TaskSecondVer3 {
	
	public static void main(String [] args) {
		
		int s = 0;
		
		// for (int i = 0; i < args.length; i++)
		for (String elem : args) {
			int a = Integer.parseInt(elem);
			s = s + a;
		}
		
		System.out.println("Sum is " + s);
		
	}
	
}