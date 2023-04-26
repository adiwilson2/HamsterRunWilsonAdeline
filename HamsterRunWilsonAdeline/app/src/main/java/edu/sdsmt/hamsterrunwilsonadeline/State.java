package edu.sdsmt.hamsterrunwilsonadeline;

public abstract class State {

    static void maintenanceTask() {

    }

    protected Game game;
    protected MainActivity mainActivity;
    protected StateMachine stateMachine;
    protected GameView gv;

    protected int collect;
    protected int backgroundColor;

    public State(Game game, MainActivity ma, StateMachine sm){
        this.game = game;
        this.mainActivity = ma;
        this.stateMachine = sm;
    }

    public abstract void endTask();
    public abstract void startTask();
    public abstract void doTask();
    public abstract void onUpdate();
    public abstract void eat();


}
