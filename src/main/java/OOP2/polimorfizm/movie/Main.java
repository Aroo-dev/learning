package OOP2.polimorfizm.movie;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "no plot here";

    }

}

class Jaws extends Movie {


    public Jaws() {
        super("jaws");
    }

    public String plot() {
        return "sharks eats a lot of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    @Override
    public String plot() {
        Integer.getInteger("5");
        return "kids try to escape of a maze";

    }

    public MazeRunner() {
        super("Maze Runner");

    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forced try to take over the universe";
    }

}

class Forgetable extends Movie {



    public Forgetable() {
        super("Forgetable");
    }
}


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <11 ; i++) {
            Movie movie = randomMovie();
            System.out.println("movie # " + i + ":" + movie.getName() + "\n" + "Plot " + movie.plot() );


        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("random number generated was " + randomNumber);
        switch (randomNumber) {
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

        }
        return null;
    }
}
