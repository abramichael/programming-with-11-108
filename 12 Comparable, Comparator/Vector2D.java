import java.util.*;

public class Vector2D implements Comparable<Vector2D> {
	
	private double x, y;
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double norm() {
		return Math.sqrt(x * x + y * y);
	}
	
	public int compareTo(Vector2D v) {
		double d = this.norm() - v.norm();
		return d > 0 ? 1 : (d < 0 ? -1 : 0);
	}
	
	public String toString() {
		return "<" + x + ", " + y + ">";
	}
	
	public static void main(String [] args) {
		/*
		Vector2D v1 = new Vector2D(1, 2);
		Vector2D v2 = new Vector2D(1, 1);
		System.out.println(v1.compareTo(v2));
		*/
		
		int n = 20 ;
		Random r = new Random();
		List<Vector2D> vectors = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			vectors.add(new Vector2D(r.nextInt(10), r.nextInt(10)));
		}
		
		System.out.println(vectors);
		
		// Natural order (by Comparable)
		// Collections.sort(vectors);
		
		Collections.sort(vectors, new Vector2DComparatorVerbose());
		
		System.out.println(vectors);
		
	}

}