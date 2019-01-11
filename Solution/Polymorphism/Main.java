package Polymorphism;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            //Upcasting
            //Reference variable of Parent class refers to the object of Child class, it is known as upcasting.
            //Since randomMovie() is getting object of a class in below switch statement.
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +" : "+movie.getName()+"\n"+
                    "Plot: "+movie.plot()+"\n");

        }
    }

    public static Movie randomMovie(){

        int random = (int) (Math.random() * 5) + 1 ;

        System.out.println("Random Number generated was: "+random);

        switch (random){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new starWars();
            case 5:
                return new forgetableMovie();
        }
        return null;
    }
}

class Movie{

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{

    public Jaws() {
        super("Jaws");
    }

    public String plot(){
        return "A sharks eats lots of people";
    }
}

class IndependenceDay extends Movie{

    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{

    public MazeRunner(){
        super("MazeRunner");
    }

    @Override
    public String plot(){
        return "Kids try and escape a maze";
    }
}

class starWars extends Movie{

    public starWars(){
        super("Star Wars");
    }

    @Override
    public String plot(){
        return "Imperial forces try to take over the universe ";
    }
}

class forgetableMovie extends Movie{

    public forgetableMovie(){
        super("forgetableMovie");
    }


}
