import java.util.*;

public class Player {
	
	private int hp;
	private String name;
	private static Scanner sc = new Scanner(System.in);
	
	public Player(String name) {
		this.name = name;
		this.hp = 50;
		System.out.println("Player " + this.name + " created.");
	}
	
	public int getHP() {
		return this.hp;
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}
	
	public void kick(Player p) {
		int f = sc.nextInt();
		/*
		double pr = 1 - f * 0.1;
		*/
		double pr = 1.0 / f;
		if (f >= 2) {
			pr += 0.3;
		}
		if (Math.random() < pr) {
			p.setHP(p.getHP() - f);
			System.out.println(this + " kicked " + p + " with force " + f + ". Now " + p + " HP is " + p.getHP());
		} else {
			System.out.println(this + " missed.");
		}
	}
	
	public String toString() {
		return this.name;
	}
	
}