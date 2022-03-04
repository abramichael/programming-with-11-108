import java.util.*;

public class Main {
	
	public static void main(String [] args) {

		int n = 20;
		Random r = new Random();
		List<Vector2D> vectors = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			vectors.add(new Vector2D(r.nextInt(10), r.nextInt(10)));
		}
		
		System.out.println(vectors);
		/*
		Collections.sort(vectors, new Comparator<Vector2D>() {
			
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
			
		});
		*/
		
		Collections.sort(vectors, (v1, v2) -> {
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
		);		
		System.out.println(vectors);
		
	}

}