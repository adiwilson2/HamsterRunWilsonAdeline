package edu.sdsmt.hamsterrunwilsonadeline;

public class Game {
    
    public Game() {
        this.food = 0;
        this.homeStores = 0;
        this.energy = 100;
        this.moves = 0;
        this.zoomsLeft = 5;
        this.lost = false;
        this.won = false;
        this.playerLocation = null;
    }
    void move(int x, int y) {

    }

    void pickup() {

    }
    void eat() {

    }
    int getFood(){
        return 0;
    }

    int getHomeStores() {
        return 0;
    }

    int getEnergy() {
        return 0;
    }

    int getMoves() {
        return 0;
    }

    int getZoomsLeft() {
        return 0;
    }

    boolean isLost() {
        return false;
    }

    boolean isWon() {
        return true;
    }

    void reset() {

    }


    public Object getPlayerLocation() {

        return null;
    }
    class Point {
        int x;
        int y;

        public Point()
        {
            this.x = 0;
            this.y = 0;
        }
    }

   // Point point = new Point();




}
