public class Main {

	public static Multiplicable [] getElems() {
		Multiplicable [] elems = new Multiplicable[2];
		elems[0] = new Vector2D(3, 5);
		elems[1] = new RationalFraction(1, 2);		
	}

	public static void main(String [] args) {

		Multiplicable [] elems = getElems();

		for (Multiplicable elem : elems) {
			System.out.println(elem);
			elem.mult(10);
			System.out.println(elem);
		}

	}

}