import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
Rocketship rocket;
Random random = new Random();
ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
ArrayList<Alien> aliens = new ArrayList<Alien>();

	

ObjectManager(Rocketship rocket){
	this.rocket=rocket;


}
	void addProjectile(Projectile projectile) {
	projectiles.add(projectile);
	}
	void addAlien() {
		aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
	}
	void update() {
		for (Alien alien : aliens) {
			alien.update();
		}
	}
	void draw(Graphics g) {
		for (Alien alien : aliens) {
			alien.draw(g);
		}
		for (Projectile projectiles : projectiles) {
			projectiles.draw(g);
		}
		rocket.draw(g);
	}
	void purgeObjects() {
		for (int i = 0; i<aliens.size(); i++) {
			if(!aliens.get(i).isActive) {
	aliens.remove(i);
	i-=1;
			}
		}
		for (int r=0; r<projectiles.size(); r++) {
			if(!projectiles.get(r).isActive) {
				projectiles.remove(r);
				r-=1;
		}
	}
}
