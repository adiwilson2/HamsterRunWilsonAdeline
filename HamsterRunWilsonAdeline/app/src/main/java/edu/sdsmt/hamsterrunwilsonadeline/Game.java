package edu.sdsmt.hamsterrunwilsonadeline;


import static java.lang.Math.abs;

public class Game {

    int food;
    int homeStores;
    int energy;
    int moves;
    int zoomsLeft;
    boolean isGameOver = false;
    Point playerLocation;
    
    public Game() {
        this.food = 0;
        this.homeStores = 0;
        this.energy = 10;
        this.moves = 0;
        this.zoomsLeft = 0;
        this.playerLocation = new Point();
    }

    int GAME_BOARD_X = 5;
    int GAME_BOARD_Y = 5;

    void move(int x, int y) {
        this.moves += (abs(x) + abs(y));
        this.energy -= 1;

        int newX = playerLocation.x + x;
        int newY = playerLocation.y + y;

        // this checks for invalid moves and fixes the moves/energy
        if (newX < 0 || newX > GAME_BOARD_X) {
            this.moves -= abs(newX);
            this.energy += 1;
            newX = playerLocation.x;
        }

        if (newY < 0 || newY > GAME_BOARD_Y) {
            this.moves -= abs(newY);
            this.energy += 1;
            newY = playerLocation.y;
        }
        // end checks for invalid moves

        this.playerLocation = new Point(newX, newY);
    }

    void pickup() {

    }
    void eat() {

    }
    int getFood() {
        return food;
    }

    int getHomeStores() {
        return homeStores;
    }

    int getEnergy() {
        return energy;
    }

    int getMoves() {
        return moves;
    }

    int getZoomsLeft() {
        return zoomsLeft;
    }

    boolean isLost() {
        return isGameOver;
    }

    boolean isWon() {
        return !isGameOver;
    }

    void reset() {
        this.food = 0;
        this.homeStores = 0;
        this.energy = 10;
        this.moves = 0;
        this.zoomsLeft = 0;
        this.playerLocation = null;
    }

    public Point getPlayerLocation() {
        return playerLocation;
    }

    class Point {
        int x;
        int y;

        public Point()
        {
            this.x = 0;
            this.y = 0;
        }

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
