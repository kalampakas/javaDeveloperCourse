package org.pgi;

class Movie {
    private String name;

    public Movie(String name){
        this.name=name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay(){
        super("Independence Day");
    }
    @Override
    public String plot(){
        return "Aliens vs virus";
    }
}

class MazeRunner extends Movie {
    public MazeRunner(){
        super("Maze Runner");
    }
    @Override
    public String plot(){
        return "YA novel turned film";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
        }
        @Override
public String plot(){
        return "darth vador";
        }
}

class Forgetable extends Movie {
    public Forgetable(){
        super("Forgetable");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=1;i<11;i++){
            System.out.println(randomMovie().plot());
        }
    }

    public static Movie randomMovie() {
        int a = (int) (Math.random() * 5) + 1;
        System.out.println("random number was " + a);
        switch (a) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }
    }
}
