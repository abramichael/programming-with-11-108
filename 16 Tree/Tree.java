public class Tree {
	
	private Node root;
	
	private static Node createTree(int n) {
		Node r = new Node();
		r.setInfo(n);
		
		int nl = n / 2;
		if (nl >= 1) {
			r.setLeft(createTree(nl));
		} else {
			r.setLeft(null);
		}
		
		int nr = n - 1 - nl;
		if (nr >= 1) {
			r.setRight(createTree(nr));
		} else {
			r.setRight(null);
		}		
		
		return r;
	}
	
	public Tree(int n) {
		
		root = createTree(n);
	
	}
	
	public void print() {
		printTree(root, 0);
	}
	
	public void printTree(Node root, int level) {
		if (root.getRight() != null) {
			printTree(root.getRight(), level + 1);
		}
		for (int i = 1; i <= level; i++) {
			System.out.print("  ");
		}
		System.out.println(root.getInfo());
		if (root.getLeft() != null) {
			printTree(root.getLeft(), level + 1);
		}

	}
	
	
}






