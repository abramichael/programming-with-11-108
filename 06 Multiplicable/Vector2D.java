public class Vector2D implements Multiplicable {

	private double x, y;

	public Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
	}


	public void mult(int number) {
		x *= number;
		y *= number;
	}

	public String toString() {
		return "<" + x + ", " + y + ">";
	}

}