public class MyArrayList<T> implements MyList<T> {
	
	private T [] array;
	private int capacity = 1000;
	private int size;
	
	public MyArrayList() {
		this.array = (T [])(new Object[this.capacity]);
		this.size = 0;
	}
	
	private boolean checkForExtension() {
		if (this.size > this.capacity / 2) {
			this.capacity += this.capacity / 2;
			T [] array2 = (T [])(new Object[this.capacity]);
			for (int i = 0; i < size; i++) {
				array2[i] = this.array[i];
			}
			this.array = array2;
			return true;
		} else {
			return false;
		}
	}
	
	public void add(T x) {
		this.array[this.size] = x;
		this.size += 1;
		this.checkForExtension();
	}
	
	public T get(int i) throws MyArrrayIndexOutOfBoundException {
		if (i < 0 || i >= size) {
			throw new MyArrrayIndexOutOfBoundException("IndexOutOfBound");
		}
		/* ToDo: implement method */
		return null;
	}
	
	public String toString() {
		if (this.size == 0) {
			return "MyArrayList<>()";
		}
		StringBuilder res = new StringBuilder("MyArrayList<");
		for (int i = 0; i < size - 1; i++) {
			res.append(this.array[i].toString() +  ", ");
		}
		res.append(this.array[size - 1].toString() + ">");
		return res.toString();
	}
	
	public static void main(String [] args) {
		
		MyList<String> lst = new MyArrayList<>();
		System.out.println(lst);
		lst.add("Hello");
		System.out.println(lst);
		lst.add("Goodbye");
		System.out.println(lst);
		try {
			System.out.println(lst.get(3));
		} catch (MyArrrayIndexOutOfBoundException e) {
			System.out.println("Sorry, not correct element index");
		}
		
	}
	
}