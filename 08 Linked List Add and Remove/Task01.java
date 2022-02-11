public class Task01 {
	
	public static Elem inputList(int n) {
		Elem head = null;
		for (int i = 0; i < n; i++) {
			Elem p = new Elem(i, head);
			head = p;			
		}
		return head;
	}

	public static Elem inputListDirect(int n) {
		Elem head = null;
		Elem end = null;
		if (n > 0) {
			head = new Elem(0, null);
			end = head;
		}
		for (int i = 1; i < n; i++) {
			Elem p = new Elem(i, null);
			end.next = p;
			end = p;
						
		}
		return head;
	}
	
	public static void outputList(Elem head) {
		
		while (head != null) {
			System.out.print(head.value + " -> ");
			head = head.next;
		}
		System.out.println("null");
		
	}
	
	public static Elem removeHead(Elem head) {
		
		return head.next;
	}
	
	public static Elem removeAll(Elem head, int k) {
		
		if (head == null) {
			return null;
		}
		while (head.next != null && head.value == k) { 
			head = head.next;
		}
		if (head.value == k) {
			return null;
		} else {
			Elem p = head;
			while (p.next != null) {
				if (p.next.value == k) {
					p.next = p.next.next;
				} else {
					p = p.next;
				}
			}
		}
		return head;
		
	}
	
	public static void main(String [] args) {
		
		int n = 5;
		
		Elem head = inputList(n);
		outputList(head);
		
		// head = inputListDirect(n);
		// outputList(head);
		
		head = removeHead(head);
		outputList(head);
		
		head = removeAll(head, 2);
		outputList(head);
	}
	
}