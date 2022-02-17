public interface MyList<T> {
	
	void add(T x);
	T get(int i) throws MyArrrayIndexOutOfBoundException;
	
}