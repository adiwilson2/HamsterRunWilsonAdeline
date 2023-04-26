package edu.sdsmt.hamsterrunwilsonadeline;


import static java.lang.Math.abs;

public class Game {

    int food;
    int pouches;
    int homeStores;
    int energy;
    int moves;
    int zoomsLeft;
    int MAX_IN_POUCH = 20;
    int MIN_IN_POUCH = 0;
    int MAX_FOOD = 15;
    int MIN_FOOD = 0;
    int MAX_ENERGY = 15;
    int MIN_ENERGY = 0;
    boolean isGameOver = false;
    Point playerLocation;
    
    public Game() {
        this.food = 0;
        this.pouches = 0;
        this.homeStores = 0;
        this.energy = 10;
        this.moves = 0;
        this.zoomsLeft = 0;
        this.playerLocation = new Point();
    }

    int GAME_BOARD_X = 4;
    int GAME_BOARD_Y = 4;

    void move(int x, int y) {
        this.moves += 1;
        this.energy -= 1;

        int newX = playerLocation.x + x;
        int newY = playerLocation.y + y;

        // this checks for invalid moves and fixes the moves/energy
        if (newX < 0 || newX > GAME_BOARD_X) {
            this.moves -= 1;
            this.energy += 1;
            newX = playerLocation.x;
        }

        if (newY < 0 || newY > GAME_BOARD_Y) {
            this.moves -= 1;
            this.energy += 1;
            newY = playerLocation.y;
        }
        // end checks for invalid moves

        this.playerLocation = new Point(newX, newY);


    }

    void pickup() {

        if() {

        }

//        if (caught <= 0){
//            isGameOver = false;
//        }

    }
    void eat() {
        //if eating then
        this.food -= 1;
        this.energy += 5;
        //removes 1 food from pouches
        if(food < MIN_FOOD || food > MAX_FOOD) {
            this.food += 1;
            this.energy -= 5;
        }


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
        this.pouches = 0;
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
