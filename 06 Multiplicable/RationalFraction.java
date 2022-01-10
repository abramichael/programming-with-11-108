public class RationalFraction implements Multiplicable {

	private int num, den;

	public RationalFraction(int num, int den) {
		this.num = num;
		this.den = den;
	}

	public void mult(int number) {
		num *= number;
		reduce();
	}

	public String toString() {
		return num + "/" + den;
	}

	public void reduce() {

	}


}