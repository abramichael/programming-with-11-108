public class MyIntArrayList implements MyIntList {
	
	private int [] array;
	private int capacity = 1000;
	private int size;
	
	public MyIntArrayList() {
		this.array = new int[this.capacity];
		this.size = 0;
	}
	
	private boolean checkForExtension() {
		if (this.size > this.capacity / 2) {
			this.capacity += this.capacity / 2;
			int [] array2 = new int[this.capacity];
			for (int i = 0; i < size; i++) {
				array2[i] = this.array[i];
			}
			this.array = array2;
			return true;
		} else {
			return false;
		}
	}
	
	public void add(int x) {
		this.array[this.size] = x;
		this.size += 1;
		this.checkForExtension();
	}
	
	public String toString() {
		if (this.size == 0) {
			return "MyIntArrayList<>";
		}
		StringBuilder res = new StringBuilder("MyIntArrayList<");
		for (int i = 0; i < size - 1; i++) {
			res.append(this.array[i] +  ", ");
		}
		res.append(this.array[size - 1] + ">");
		return res.toString();
	}
	
	public static void main(String [] args) {
		
		MyIntList lst = new MyIntArrayList();
		System.out.println(lst);
		lst.add(5);
		System.out.println(lst);
		lst.add(10);
		System.out.println(lst);
		
	}
	
}