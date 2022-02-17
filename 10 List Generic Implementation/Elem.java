public class Elem<T> {
	
	T value;
	Elem<T> next;
	
	public Elem(T value, Elem<T> next) {
		this.value = value;
		this.next = next;
	}
	
}