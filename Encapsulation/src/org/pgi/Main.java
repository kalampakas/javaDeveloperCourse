package org.pgi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player = new Player();
        player.name="Tim";
        player.health=20;
        player.weapon="Uzi";
        int damage=10;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());
        player.loseHealth(damage);

        EnhancedPlayer joe = new EnhancedPlayer("Joe",50,"shotgun");
        System.out.println("health is "+joe.getHealth());
    }
}
