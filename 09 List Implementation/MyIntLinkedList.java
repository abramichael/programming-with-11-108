public class MyIntLinkedList implements MyIntList {
	
	private int size;
	private Elem head, end;
	
	public MyIntLinkedList() {
		this.head = null;
		this.end = null;
		this.size = 0;
	}
	
	public void add(int x) {
		if (this.size == 0) {
			this.head = new Elem(x, null);
			this.end = this.head;
		} else {
			this.end.next = new Elem(x, null);
			this.end = this.end.next;
		}
		this.size += 1;
	}
	
	public String toString() {
		if (this.size == 0) {
			return "MyIntLinkedList<>";
		}
		StringBuilder res = new StringBuilder("MyIntLinkedList<");
		for (Elem p = this.head; p.next != null; p = p.next) {
			res.append(p.value +  ", ");
		}
		res.append(this.end.value + ">");
		return res.toString();
	}
	
	public static void main(String [] args) {
		
		MyIntList lst = new MyIntLinkedList();
		System.out.println(lst);
		lst.add(5);
		System.out.println(lst);
		lst.add(10);
		System.out.println(lst);
		
	}
	
}