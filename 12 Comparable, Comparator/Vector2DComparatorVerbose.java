import java.util.*;

public class Vector2DComparatorVerbose implements Comparator<Vector2D> {
	
	public int compare(Vector2D v1, Vector2D v2) {
		if (v1.getX() > v2.getX()) {
			return 1;
		} else if (v1.getX() < v2.getX()) {
			return -1;
		} else {
			if (v1.getY() > v2.getY()) {
				return 1;
			} else if (v1.getY() < v2.getY()) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}
