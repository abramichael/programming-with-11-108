import java.util.regex.*;

public class RegExStart {
	
	public static void main(String [] args) {
		
		String regex = "[ABCEHKMOPTXY]\\d{3}[ABCEHKMOPTXY]{2}\\d{2}(\\d?)";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("O336AX116");
		System.out.println(m.matches());
		
	}
	
}