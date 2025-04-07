abstract class Game {
    String title;

    Game(String title) {
        this.title = title;
    }

    abstract void start();
    abstract void play();
    abstract void end();
}

class RacingGame extends Game {
    RacingGame(String title) {
        super(title);
    }

    void start() {
        System.out.println(title + " is starting.");
    }

    void play() {
        System.out.println("Racing in " + title);
    }

    void end() {
        System.out.println(title + " has ended.");
    }
}

class ShootingGame extends Game {
    ShootingGame(String title) {
        super(title);
    }

    void start() {
        System.out.println(title + " is launching.");
    }

    void play() {
        System.out.println("Shooting enemies in " + title);
    }

    void end() {
        System.out.println(title + " is over.");
    }
}

public class Main {
    public static void main(String[] args) {
        Game game1 = new RacingGame("SpeedX");
        game1.start();
        game1.play();
        game1.end();

        Game game2 = new ShootingGame("WarZone");
        game2.start();
        game2.play();
        game2.end();
    }
}
