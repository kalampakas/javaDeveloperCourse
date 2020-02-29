package org.pgi;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        if(this.health<=0) {
            System.out.println("Knocked out");
        }
        this.health=this.health-damage;
    }

    public int healthRemaining(){
        return health;
    }
}
