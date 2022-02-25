import java.util.*;

class Cell {
	int x, y;
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Miner {

	final static int M = 10;
	final static int N = 10;

	public static int checkMinesAround(int i, int j, int [][] mines) {
		int k = 0;
		for (int i1 = -1; i1 <= 1; i1++) {
			for (int j1 = -1; j1 <= 1; j1++) {
				if (i1 != 0 || j1 != 0) {
					try {
						k += mines[i+i1][j+j1];
					}
					catch (ArrayIndexOutOfBoundsException e) {
					}
				}
			}
		}
		return k;
	}
	
	public static void initField(String [][] field) {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				field[i][j] = ".";
			}
		}
	}
	
	public static void printField(String [][] field) {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(field[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String [] args) {
		

		int [][] mines = new int[][] {
			{0,0,0,0,0,0,0,0,1,0},
			{0,1,0,0,1,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,0,0,0,0,0,1,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,1},
			{0,0,0,0,1,0,0,0,0,0},
			{0,0,0,0,0,0,0,1,0,0},
			{0,0,0,0,1,0,0,0,0,0}
		};
		String [][] field = new String[M][N];
		initField(field);
		int i = 5;
		int j = 5;
		
		if (mines[i][j] == 1) {
			System.out.println("Game Over");
		}
		else {
			int k = checkMinesAround(i, j, mines);
			if (k > 0) {
				field[i][j] = k + "";
				printField(field);
			} else {
				Queue<Cell> q = new LinkedList<>();
				for (int i1 = -1; i1 <= 1; i1++) {
					for (int j1 = -1; j1 <= 1; j1++) {
						if (i1 != 0 || j1 != 0) {
							try {
								int w = mines[i + i1][j + j1];
								Cell c = new Cell(i + i1, j + j1);
								q.offer(c);
							}
							catch (ArrayIndexOutOfBoundsException e) {
							}
						}
					}
				}
				field[i][j] = "_";
				printField(field);
				while (!q.isEmpty()) {
					System.out.println(q.size());
					Cell c = q.remove();
					k = checkMinesAround(c.x, c.y, mines);
					if (k > 0) {
						field[c.x][c.y] = k + "";
						printField(field);
					} else {
						for (int i1 = -1; i1 <= 1; i1++) {
							for (int j1 = -1; j1 <= 1; j1++) {
								if (i1 != 0 || j1 != 0) {
									try {
										int w = mines[c.x + i1][c.y + j1];
										if (field[c.x + i1][c.y + j1].equals(".")) {
											Cell c1 = new Cell(c.x + i1, c.y + j1);
											q.offer(c1);
										}
									}
									catch (ArrayIndexOutOfBoundsException e) {
									}
								}
							}
						}
						field[c.x][c.y] = "_";
						printField(field);
					}
				}
			}
		}
			
	}
	
	
}
