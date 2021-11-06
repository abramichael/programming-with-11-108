public class Game {
	/*
	public Game(int maxhp) {
		this.p1 = new Player(...)
	}
	
	public void play()
	*/
	
	public static void main(String [] args) {
		
		Player p1 = new Player("Alina");
		Player p2 = new Player("Adelya");
		
		while (p1.getHP() > 0 && p2.getHP() >0) {
			p1.kick(p2);
			if (p2.getHP() > 0) {
				p2.kick(p1);
			}
		}
		
		// (new Game(...)).play()
		
	}
	
}